package com.google.protobuf;

/* loaded from: classes4.dex */
public enum n2 extends p2 {
    public n2() {
        super("STRICT", 1);
    }

    @Override // com.google.protobuf.p2
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
