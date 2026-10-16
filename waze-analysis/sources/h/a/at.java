package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at extends h.c.b.a.f implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f47991a;

    /* renamed from: b, reason: collision with root package name */
    Object f47992b;

    /* renamed from: c, reason: collision with root package name */
    int f47993c;

    /* renamed from: d, reason: collision with root package name */
    int f47994d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f47995e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Iterator f47996f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f47997g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f47998h;

    /* renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f47999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(int i2, Iterator it, boolean z, boolean z2, h.c.e eVar) {
        super(2, eVar);
        this.f47995e = i2;
        this.f47996f = it;
        this.f47997g = z;
        this.f47998h = z2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        at atVar = new at(this.f47995e, this.f47996f, this.f47997g, this.f47998h, eVar);
        atVar.f47999i = obj;
        return atVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((at) create((h.m.j) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008c -> B:13:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0111 -> B:56:0x0114). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0149 -> B:69:0x014c). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.at.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
