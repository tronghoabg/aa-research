package com.google.firebase.crashlytics.a.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f9767a;

    /* renamed from: b, reason: collision with root package name */
    private final b f9768b = new b(1);

    public a(c... cVarArr) {
        this.f9767a = cVarArr;
    }

    @Override // com.google.firebase.crashlytics.a.i.c
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        c[] cVarArr = this.f9767a;
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            c cVar = cVarArr[0];
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = cVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.f9768b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
