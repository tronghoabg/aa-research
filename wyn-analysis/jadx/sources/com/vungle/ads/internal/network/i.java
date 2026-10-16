package com.vungle.ads.internal.network;

import cg.C1618g;
import cg.InterfaceC1620i;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class i extends cg.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f33411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC1620i interfaceC1620i) {
        super(interfaceC1620i);
        this.f33411a = jVar;
    }

    @Override // cg.o, cg.H
    public final long read(C1618g sink, long j8) throws IOException {
        AbstractC3340k.e(sink, "sink");
        try {
            return super.read(sink, j8);
        } catch (IOException e7) {
            this.f33411a.a(e7);
            throw e7;
        }
    }
}
