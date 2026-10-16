package com.waze.gw;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
final class WazeTtsBridge {
    private static final String TAG = "WazeGW-RoadTts";
    private static volatile Object manager;
    private static volatile Method playTts;

    private WazeTtsBridge() {
    }

    static boolean speak(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            Method method = playTts;
            Object obj = manager;
            if (method == null || obj == null) {
                synchronized (WazeTtsBridge.class) {
                    Method method2 = playTts;
                    Object objInvoke = manager;
                    if (method2 == null || objInvoke == null) {
                        Class<?> cls = Class.forName("com.waze.sound.SoundNativeManager");
                        objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke == null) {
                            return false;
                        }
                        method2 = cls.getMethod("playTts", String.class);
                        manager = objInvoke;
                        playTts = method2;
                    }
                    method = method2;
                    obj = objInvoke;
                }
            }
            boolean zArmForModTts = AudioMixPolicy.armForModTts();
            try {
                method.invoke(obj, str);
                return true;
            } catch (Throwable th) {
                if (zArmForModTts) {
                    AudioMixPolicy.cancelModTtsArm();
                }
                throw th;
            }
        } catch (Throwable th2) {
            Log.w(TAG, "Waze TTS not ready: " + th2.getClass().getSimpleName());
            return false;
        }
    }
}
