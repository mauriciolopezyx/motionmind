"use client"

import { Geist } from "next/font/google";
import "./globals.css";
//import { Toaster } from "@/components/ui/sonner";
import { QueryProvider } from "@/components/QueryProvider"
import { ThemeProvider } from "@/components/ThemeProvider"

const geist = Geist({ subsets: ['latin'] });

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {

  return (
    <html lang="en" suppressHydrationWarning>
      <body className={geist.className}>
        <ThemeProvider
            attribute="class"
            defaultTheme="system"
            enableSystem
            disableTransitionOnChange
        >
          <QueryProvider>
            {children}
          </QueryProvider>
          {/* <Toaster /> */}
        </ThemeProvider>
      </body>
    </html>
  );
}