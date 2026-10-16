package com.google.y.a.a.b;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f13430a = new ArrayDeque(16);

    private c() {
    }

    public static c a() {
        return new c();
    }

    private final long h() {
        Deque deque = this.f13430a;
        if (deque.isEmpty()) {
            return 0L;
        }
        return ((Long) deque.peek()).longValue();
    }

    private final void i(long j2) {
        Deque deque = this.f13430a;
        deque.pop();
        deque.push(Long.valueOf(j2));
    }

    private static final void j(String str) throws IOException {
        throw new IOException(str);
    }

    private static final void k(String str, Object... objArr) throws IOException {
        j(String.format(str, objArr));
    }

    public final void b() throws IOException {
        Deque deque = this.f13430a;
        if (deque.isEmpty()) {
            return;
        }
        k("data item not completed, stackSize: %s scope: %s", Integer.valueOf(deque.size()), Long.valueOf(h()));
    }

    public final void c() throws IOException {
        long jH = h();
        if (jH >= 0) {
            k("expected indefinite length scope but found %s", Long.valueOf(jH));
        } else if (jH == -5) {
            j("expected a value for dangling key in indefinite-length map");
        }
        this.f13430a.pop();
    }

    public final void d() throws IOException {
        long jH = h();
        if (jH != -1) {
            if (jH != -2) {
                return;
            } else {
                jH = -2;
            }
        }
        k("expected non-string scope but found %s", Long.valueOf(jH));
    }

    public final void e(long j2) throws IOException {
        long jH = h();
        if (jH != j2) {
            if (jH != -1) {
                if (jH != -2) {
                    return;
                } else {
                    jH = -2;
                }
            }
            k("expected non-string scope or scope %s but found %s", Long.valueOf(j2), Long.valueOf(jH));
        }
    }

    public final void f() {
        long jH = h();
        if (jH == 1) {
            this.f13430a.pop();
            return;
        }
        if (jH > 1) {
            i(jH - 1);
        } else if (jH == -4) {
            i(-5L);
        } else if (jH == -5) {
            i(-4L);
        }
    }

    public final void g(long j2) {
        this.f13430a.push(Long.valueOf(j2));
    }
}
