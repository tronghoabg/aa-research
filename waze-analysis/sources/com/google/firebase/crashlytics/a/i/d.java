package com.google.firebase.crashlytics.a.i;

import java.util.Stack;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f9770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9771b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f9772c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9773d;

    private d(String str, String str2, StackTraceElement[] stackTraceElementArr, d dVar) {
        this.f9770a = str;
        this.f9771b = str2;
        this.f9772c = stackTraceElementArr;
        this.f9773d = dVar;
    }

    public static d a(Throwable th, c cVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        d dVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            dVar = new d(th2.getLocalizedMessage(), th2.getClass().getName(), cVar.a(th2.getStackTrace()), dVar);
        }
        return dVar;
    }
}
