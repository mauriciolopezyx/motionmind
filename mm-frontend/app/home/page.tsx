"use client"

import CameraStreamingManager from "@/components/CameraStreamingManager"
//import { serverPrediction } from "@/hooks/websocket-manager"

// Scenarios
// 1. Camera is on, but not streaming
// 2. Camera is on and is streaming (to Spring Boot)
// 3. Camera turns off and also stops streaming

export default function HomePage() {

    // function onPrediction(pred: serverPrediction) {

    // }

    return (
        <>
            <div className="bg-muted flex min-h-svh flex-col items-center justify-center gap-6 p-6 md:p-10">
                <div className="flex w-full justify-center items-center gap-6">
                    <div className="w-full max-w-[350px] flex flex-col gap-6">
                        <CameraStreamingManager onPrediction={() => {}} />
                    </div>
                    <div className="w-full max-w-[350px] flex flex-col gap-6">
                        <div className="flex justify-center">
                            <h3 className="bg-gray-300 px-8 dark:bg-gray-600 p-2 rounded-md shadow-md font-bold">Server</h3>
                        </div>
                        <img id="wireframe-display" width={350} height={350}/>
                        <div className="w-full h-[60px]"></div>
                    </div>
                </div>
            </div>
        </>
    )
    
}