package h.f;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.io.File;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements h.m.h {

    /* renamed from: a, reason: collision with root package name */
    private final File f48086a;

    /* renamed from: b, reason: collision with root package name */
    private final l f48087b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.p f48088c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(File file, l lVar) {
        this(file, lVar, null);
        x.f(file, TtmlNode.START);
        x.f(lVar, "direction");
    }

    public final k b(h.g.a.p pVar) {
        x.f(pVar, "function");
        return new k(this.f48086a, this.f48087b, pVar);
    }

    @Override // h.m.h
    public final Iterator<File> iterator() {
        return new i(this);
    }

    private k(File file, l lVar, h.g.a.p pVar) {
        this.f48086a = file;
        this.f48087b = lVar;
        this.f48088c = pVar;
    }
}
