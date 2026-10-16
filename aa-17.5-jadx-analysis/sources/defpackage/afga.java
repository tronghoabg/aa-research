package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afga extends affc {
    public volatile List a;
    private final String b;
    private final afie c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afga(Object obj, String str, afie afieVar) {
        super(obj);
        obj.getClass();
        str.getClass();
        afieVar.getClass();
        this.b = str;
        this.c = afieVar;
    }

    @Override // defpackage.afic
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.afic
    public final List<afib> getUpperBounds() {
        List<afib> list = this.a;
        if (list != null) {
            return list;
        }
        List<afib> listBg = woy.bg(affw.e(Object.class));
        this.a = listBg;
        return listBg;
    }

    @Override // defpackage.afic
    public final afie getVariance() {
        return this.c;
    }
}
