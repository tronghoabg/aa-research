package h.f;

import h.g.b.x;
import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements h.m.h {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f48096a;

    public o(BufferedReader bufferedReader) {
        x.f(bufferedReader, "reader");
        this.f48096a = bufferedReader;
    }

    @Override // h.m.h
    public final Iterator<String> iterator() {
        return new n(this);
    }
}
