package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Utils {
    static DebugHandle sOurHandle;

    /* compiled from: WazeSource */
    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String strSubstring = String.valueOf(stackTraceElement.getMethodName()).concat("                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + strSubstring;
        System.out.println(str2 + " " + str);
        DebugHandle debugHandle = sOurHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }

    public static void logStack(String str, int i2) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i2, stackTrace.length - 1);
        String strConcat = " ";
        for (int i3 = 1; i3 <= iMin; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
            strConcat = strConcat.concat(" ");
            System.out.println(str + strConcat + str2 + strConcat);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f2, float f3, float f4, float f5) {
        int iClamp = clamp((int) (f5 * 255.0f));
        return (clamp((int) (f2 * 255.0f)) << 16) | (iClamp << 24) | (clamp((int) (f3 * 255.0f)) << 8) | clamp((int) (f4 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        sOurHandle = debugHandle;
    }

    public static void socketSend(String str) throws IOException {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        float fPow = (float) Math.pow(fArr[0], 0.45454545454545453d);
        float fPow2 = (float) Math.pow(fArr[1], 0.45454545454545453d);
        float fPow3 = (float) Math.pow(fArr[2], 0.45454545454545453d);
        return (clamp((int) (fPow * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (fPow2 * 255.0f)) << 8) | clamp((int) (fPow3 * 255.0f));
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }
}
