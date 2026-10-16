package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yqv extends yqn {
    private static final boolean a = a.a();
    private static final boolean b;
    private static final yqm c;

    final class a {
        a() {
        }

        static boolean a() {
            return yqv.t();
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new yqm() { // from class: yqv.1
            @Override // defpackage.yqm
            public yok a(Class<?> cls, int i) {
                return yok.a;
            }

            @Override // defpackage.yqm
            public String b(Class<? extends yns<?>> cls) {
                StackTraceElement stackTraceElementA;
                if (yqv.a) {
                    try {
                        if (cls.equals(yqv.p())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!yqv.b || (stackTraceElementA = yse.a(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementA.getClassName();
            }
        };
    }

    static Class<?> p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return a.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.yqn
    protected ypp e(String str) {
        AtomicReference atomicReference = yqy.d;
        if (atomicReference.get() != null) {
            return ((yqt) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        yqy yqyVar = new yqy(str);
        yqx.a.offer(yqyVar);
        if (atomicReference.get() == null) {
            return yqyVar;
        }
        yqy.c();
        return yqyVar;
    }

    @Override // defpackage.yqn
    protected yqm h() {
        return c;
    }

    @Override // defpackage.yqn
    protected yrm j() {
        return yqz.a;
    }

    @Override // defpackage.yqn
    protected String m() {
        return "platform: Android";
    }
}
