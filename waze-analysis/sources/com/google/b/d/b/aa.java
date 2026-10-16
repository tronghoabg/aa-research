package com.google.b.d.b;

import com.google.d.d.bn;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private bn f7068a;

    /* renamed from: b, reason: collision with root package name */
    private bn f7069b;

    /* renamed from: c, reason: collision with root package name */
    private UUID f7070c;

    /* renamed from: d, reason: collision with root package name */
    private long f7071d;

    /* renamed from: e, reason: collision with root package name */
    private byte f7072e;

    public final ab a() {
        bn bnVar;
        bn bnVar2;
        UUID uuid;
        if (this.f7072e == 1 && (bnVar = this.f7068a) != null && (bnVar2 = this.f7069b) != null && (uuid = this.f7070c) != null) {
            return new ab(bnVar, bnVar2, uuid, this.f7071d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7068a == null) {
            sb.append(" spansNames");
        }
        if (this.f7069b == null) {
            sb.append(" extras");
        }
        if (this.f7070c == null) {
            sb.append(" rootTraceId");
        }
        if (this.f7072e == 0) {
            sb.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(bn bnVar) {
        if (bnVar == null) {
            throw new NullPointerException("Null extras");
        }
        this.f7069b = bnVar;
    }

    public final void c() {
        this.f7071d = -1L;
        this.f7072e = (byte) 1;
    }

    public final void d(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.f7070c = uuid;
    }

    public final void e(bn bnVar) {
        if (bnVar == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.f7068a = bnVar;
    }
}
