package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zdu extends zdw {
    @Override // defpackage.zdw
    public final /* bridge */ /* synthetic */ Class a(Object obj) {
        return (Class) obj;
    }

    @Override // defpackage.zdw
    public final /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return Arrays.asList(((Class) obj).getInterfaces());
    }

    @Override // defpackage.zdw
    public final /* synthetic */ Object c(Object obj) {
        return ((Class) obj).getSuperclass();
    }
}
