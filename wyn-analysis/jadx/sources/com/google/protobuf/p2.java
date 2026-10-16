package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m2 f27732a;

    /* renamed from: b, reason: collision with root package name */
    public static final n2 f27733b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p2[] f27734c;

    static {
        m2 m2Var = new m2();
        f27732a = m2Var;
        n2 n2Var = new n2();
        f27733b = n2Var;
        f27734c = new p2[]{m2Var, n2Var, new p2() { // from class: com.google.protobuf.o2
            @Override // com.google.protobuf.p2
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static p2 valueOf(String str) {
        return (p2) java.lang.Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) f27734c.clone();
    }

    public abstract Object a(CodedInputStream codedInputStream);
}
