package j9;

import java.util.Map;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3091a implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38675a;

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        switch (this.f38675a) {
            case 0:
                throw new h9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                h9.f fVar = (h9.f) obj2;
                fVar.add(k9.f.f39328g, entry.getKey());
                fVar.add(k9.f.f39329h, entry.getValue());
                return;
            default:
                throw new h9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
