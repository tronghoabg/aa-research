package com.waze.map.opengl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WazeRenderer f29527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29530d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f29531e;

    public /* synthetic */ ac(WazeRenderer wazeRenderer, int i2, int i3, kotlinx.coroutines.h.a aVar, int i4) {
        this.f29531e = i4;
        this.f29527a = wazeRenderer;
        this.f29528b = i2;
        this.f29529c = i3;
        this.f29530d = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.h.a] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29531e != 0) {
            int i2 = this.f29529c;
            WazeRenderer.o(this.f29527a, (String) this.f29530d, this.f29528b, i2);
            return;
        }
        ?? r0 = this.f29530d;
        int i3 = this.f29529c;
        WazeRenderer.p(this.f29527a, this.f29528b, i3, r0);
    }

    public /* synthetic */ ac(WazeRenderer wazeRenderer, String str, int i2, int i3, int i4) {
        this.f29531e = i4;
        this.f29527a = wazeRenderer;
        this.f29530d = str;
        this.f29528b = i2;
        this.f29529c = i3;
    }
}
