package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class c {

    public static class a extends t {
        public a(long j8, long j10, int i5, long j11, ByteBuffer byteBuffer) {
            super(j8, j10, i5, j11, byteBuffer);
        }
    }

    public static a a(q qVar) throws s {
        t tVarA = d.a(qVar);
        return new a(tVarA.a(), tVarA.c(), tVarA.b(), tVarA.e(), tVarA.d());
    }
}
