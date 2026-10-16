package com.google.d.f.f;

import com.google.d.d.fo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements d {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls) {
        String name = cls.getName();
        boolean z = false;
        for (int i2 = 3; i2 < stackTraceElementArr.length; i2++) {
            if (stackTraceElementArr[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.d.f.f.d
    public final StackTraceElement a(Class cls) {
        fo.l(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls);
        if (iC != -1) {
            return stackTrace[iC];
        }
        return null;
    }

    @Override // com.google.d.f.f.d
    public final StackTraceElement[] b(Class cls, int i2) {
        fo.l(i2 == -1 || i2 > 0, "maxDepth must be > 0 or -1");
        fo.l(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls);
        if (iC == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iC;
        if (i2 <= 0 || i2 >= length) {
            i2 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        System.arraycopy(stackTrace, iC, stackTraceElementArr, 0, i2);
        return stackTraceElementArr;
    }
}
