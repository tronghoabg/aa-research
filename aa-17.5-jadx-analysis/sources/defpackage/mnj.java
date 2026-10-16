package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class mnj implements mni {
    private final List a;

    public mnj(List list) {
        this.a = list;
    }

    @Override // defpackage.mni
    public final String a(int i) {
        Object obj = this.a.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
