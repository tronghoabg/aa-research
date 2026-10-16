package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<C1836t0> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public Q1 build() {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.syntax == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new Q1(this.syntax, this.messageSetWireFormat, this.checkInitialized, (C1836t0[]) this.fields.toArray(new C1836t0[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(C1836t0 c1836t0) {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.fields.add(c1836t0);
    }

    public void withMessageSetWireFormat(boolean z2) {
        this.messageSetWireFormat = z2;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i5) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i5);
    }
}
