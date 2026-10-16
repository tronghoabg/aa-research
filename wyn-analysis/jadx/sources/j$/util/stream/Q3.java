package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes2.dex */
abstract class Q3 {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f38068a = ((Boolean) AccessController.doPrivileged(new P3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
