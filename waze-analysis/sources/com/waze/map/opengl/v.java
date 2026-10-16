package com.waze.map.opengl;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f29566a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f29567b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeMapRenderer wazeMapRenderer, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeMapRenderer;
        this.f29567b = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f29568c;
        if (i2 == 0) {
            return new v((WazeMapRenderer) this.f29566a, (Runnable) this.f29567b, eVar, 0);
        }
        if (i2 == 1) {
            return new v((WazeMapRenderer) this.f29566a, (String) this.f29567b, eVar, 1);
        }
        if (i2 == 2) {
            return new v((WazeMapRenderer) this.f29566a, (Runnable) this.f29567b, eVar, 2, (byte[]) null);
        }
        if (i2 == 3) {
            return new v((WazeMapRenderer) this.f29566a, (h.g.a.l) this.f29567b, eVar, 3);
        }
        Object obj2 = this.f29566a;
        if (i2 != 4) {
            return new v((WazeRenderer) obj2, (String) this.f29567b, eVar, 5);
        }
        return new v((WazeMapRenderer) obj2, (h.g.a.l) this.f29567b, eVar, 4, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f29568c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f29568c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ?? r3 = this.f29567b;
            WazeMapRenderer wazeMapRenderer = (WazeMapRenderer) this.f29566a;
            wazeMapRenderer.f29503d.add(r3);
            if (wazeMapRenderer.f29504e.d() == null) {
                r3.run();
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Iterator it = ((WazeMapRenderer) this.f29566a).f29502c.iterator();
            while (it.hasNext()) {
                ((h.g.a.l) it.next()).invoke(this.f29567b);
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((WazeMapRenderer) this.f29566a).f29503d.remove(this.f29567b);
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ?? r32 = this.f29567b;
            WazeMapRenderer wazeMapRenderer2 = (WazeMapRenderer) this.f29566a;
            wazeMapRenderer2.f29502c.add(r32);
            String str = (String) wazeMapRenderer2.f29504e.d();
            if (str != null) {
                r32.invoke(str);
            }
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((WazeMapRenderer) this.f29566a).f29502c.remove(this.f29567b);
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Iterator it2 = h.a.i.ao(((WazeRenderer) this.f29566a).f29511f).iterator();
        while (it2.hasNext()) {
            ((h.g.a.l) it2.next()).invoke(this.f29567b);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeMapRenderer wazeMapRenderer, h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeMapRenderer;
        this.f29567b = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeMapRenderer wazeMapRenderer, Runnable runnable, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeMapRenderer;
        this.f29567b = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeMapRenderer wazeMapRenderer, Runnable runnable, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeMapRenderer;
        this.f29567b = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeMapRenderer wazeMapRenderer, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeMapRenderer;
        this.f29567b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(WazeRenderer wazeRenderer, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29568c = i2;
        this.f29566a = wazeRenderer;
        this.f29567b = str;
    }
}
