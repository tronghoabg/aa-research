package com.google.protobuf;

/* loaded from: classes4.dex */
public enum m2 extends p2 {
    public m2() {
        super("LOOSE", 0);
    }

    @Override // com.google.protobuf.p2
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readString();
    }
}
