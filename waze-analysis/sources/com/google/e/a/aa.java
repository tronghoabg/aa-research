package com.google.e.a;

import com.google.e.a.h.bs;
import com.google.e.a.h.bu;
import com.google.e.a.h.bv;
import com.google.e.a.h.bw;
import com.google.e.a.h.bx;
import com.google.e.a.h.bz;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8354a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static bz a(bu buVar) {
        bv bvVarNewBuilder = bz.newBuilder();
        bvVarNewBuilder.b(buVar.getPrimaryKeyId());
        for (bs bsVar : buVar.getKeyList()) {
            bw bwVarNewBuilder = bx.newBuilder();
            bwVarNewBuilder.d(bsVar.getKeyData().getTypeUrl());
            bwVarNewBuilder.c(bsVar.getStatus());
            bwVarNewBuilder.b(bsVar.getOutputPrefixType());
            bwVarNewBuilder.a(bsVar.getKeyId());
            bvVarNewBuilder.a(bwVarNewBuilder.build());
        }
        return bvVarNewBuilder.build();
    }
}
