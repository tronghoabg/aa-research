package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ysa extends defpackage.yrs {
    private static final boolean a = ysa.a.a();
    private static final boolean b;
    private static final defpackage.yrr c;

    final class a {
        a() {
        }

        static boolean a() {
            return defpackage.ysa.t();
        }
    }

    static {
        boolean z = true;
        if (android.os.Build.FINGERPRINT != null && !"robolectric".equals(android.os.Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new defpackage.yrr() { // from class: ysa.1
            @Override // defpackage.yrr
            public defpackage.ypp a(java.lang.Class<?> cls, int i) {
                return defpackage.ypp.a;
            }

            @Override // defpackage.yrr
            public java.lang.String b(java.lang.Class<? extends defpackage.yox<?>> cls) {
                java.lang.StackTraceElement stackTraceElementA;
                if (defpackage.ysa.a) {
                    try {
                        if (cls.equals(defpackage.ysa.p())) {
                            return dalvik.system.VMStack.getStackClass2().getName();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (!defpackage.ysa.b || (stackTraceElementA = ytj.a(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementA.getClassName();
            }
        };
    }

    static java.lang.Class<?> p() {
        return dalvik.system.VMStack.getStackClass2();
    }

    static java.lang.String q() {
        try {
            return dalvik.system.VMStack.getStackClass2().getName();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return ysa.a.class.getName().equals(q());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.yrs
    protected defpackage.yqu e(java.lang.String str) {
        char cCharAt;
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.ysd.d;
        if (atomicReference.get() != null) {
            return ((defpackage.yry) atomicReference.get()).a(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace('$', '.');
                break;
            }
        } while (cCharAt != '.');
        defpackage.ysd ysdVar = new defpackage.ysd(str);
        defpackage.ysc.a.offer(ysdVar);
        if (atomicReference.get() == null) {
            return ysdVar;
        }
        defpackage.ysd.c();
        return ysdVar;
    }

    @Override // defpackage.yrs
    protected defpackage.yrr h() {
        return c;
    }

    @Override // defpackage.yrs
    protected defpackage.ysr j() {
        return defpackage.yse.a;
    }

    @Override // defpackage.yrs
    protected java.lang.String m() {
        return "platform: Android";
    }
}
