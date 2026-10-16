package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cy implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cy f51072a = new cy();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51073b = new bw("kotlin.uuid.Uuid", kotlinx.b.a.o.f50919a);

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        String strConcat;
        h.g.b.x.f(eVar, "decoder");
        String strDecodeString = eVar.decodeString();
        h.g.b.x.f(strDecodeString, "uuidString");
        int length = strDecodeString.length();
        int i2 = 0;
        if (length == 32) {
            h.g.b.x.f(strDecodeString, "hexString");
            h.g.b.x.f(strDecodeString, "hexString");
            long j2 = 0;
            while (true) {
                if (i2 >= 16) {
                    long j3 = 0;
                    for (int i3 = 16; i3 < 32; i3++) {
                        long j4 = j3 << 4;
                        char cCharAt = strDecodeString.charAt(i3);
                        if ((cCharAt >>> '\b') != 0 || h.n.d.f48234b[cCharAt] < 0) {
                            i2 = i3;
                        } else {
                            j3 = j4 | h.n.d.f48234b[cCharAt];
                        }
                    }
                    return h.d.b.e(j2, j3);
                }
                long j5 = j2 << 4;
                char cCharAt2 = strDecodeString.charAt(i2);
                if ((cCharAt2 >>> '\b') != 0 || h.n.d.f48234b[cCharAt2] < 0) {
                    break;
                }
                j2 = j5 | h.n.d.f48234b[cCharAt2];
                i2++;
            }
            h.e.b.j(strDecodeString, "a hexadecimal digit", i2);
            throw new h.e();
        }
        if (length != 36) {
            if (strDecodeString.length() <= 64) {
                strConcat = strDecodeString;
            } else {
                h.g.b.x.d(strDecodeString, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = strDecodeString.substring(0, 64);
                h.g.b.x.e(strSubstring, "substring(...)");
                strConcat = String.valueOf(strSubstring).concat("...");
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + strConcat + "\" of length " + strDecodeString.length());
        }
        h.g.b.x.f(strDecodeString, "hexDashString");
        h.g.b.x.f(strDecodeString, "hexDashString");
        long j6 = 0;
        while (true) {
            int i4 = 8;
            if (i2 >= 8) {
                if (strDecodeString.charAt(8) == '-') {
                    i2 = 9;
                    long j7 = 0;
                    while (true) {
                        i4 = 13;
                        if (i2 < 13) {
                            long j8 = j7 << 4;
                            char cCharAt3 = strDecodeString.charAt(i2);
                            if ((cCharAt3 >>> '\b') != 0 || h.n.d.f48234b[cCharAt3] < 0) {
                                break;
                            }
                            j7 = j8 | h.n.d.f48234b[cCharAt3];
                            i2++;
                        } else if (strDecodeString.charAt(13) == '-') {
                            i2 = 14;
                            long j9 = 0;
                            while (true) {
                                i4 = 18;
                                if (i2 < 18) {
                                    long j10 = j9 << 4;
                                    char cCharAt4 = strDecodeString.charAt(i2);
                                    if ((cCharAt4 >>> '\b') != 0 || h.n.d.f48234b[cCharAt4] < 0) {
                                        break;
                                    }
                                    j9 = j10 | h.n.d.f48234b[cCharAt4];
                                    i2++;
                                } else if (strDecodeString.charAt(18) == '-') {
                                    i2 = 19;
                                    long j11 = 0;
                                    while (true) {
                                        i4 = 23;
                                        if (i2 < 23) {
                                            long j12 = j11 << 4;
                                            char cCharAt5 = strDecodeString.charAt(i2);
                                            if ((cCharAt5 >>> '\b') != 0 || h.n.d.f48234b[cCharAt5] < 0) {
                                                break;
                                            }
                                            j11 = j12 | h.n.d.f48234b[cCharAt5];
                                            i2++;
                                        } else if (strDecodeString.charAt(23) == '-') {
                                            i2 = 24;
                                            long j13 = 0;
                                            while (i2 < 36) {
                                                long j14 = j13 << 4;
                                                char cCharAt6 = strDecodeString.charAt(i2);
                                                if ((cCharAt6 >>> '\b') == 0 && h.n.d.f48234b[cCharAt6] >= 0) {
                                                    j13 = j14 | h.n.d.f48234b[cCharAt6];
                                                    i2++;
                                                }
                                            }
                                            return h.d.b.e((j6 << 32) | (j7 << 16) | j9, (j11 << 48) | j13);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                h.e.b.j(strDecodeString, "'-' (hyphen)", i4);
                throw new h.e();
            }
            long j15 = j6 << 4;
            char cCharAt7 = strDecodeString.charAt(i2);
            if ((cCharAt7 >>> '\b') != 0 || h.n.d.f48234b[cCharAt7] < 0) {
                break;
            }
            j6 = j15 | h.n.d.f48234b[cCharAt7];
            i2++;
        }
        h.e.b.j(strDecodeString, "a hexadecimal digit", i2);
        throw new h.e();
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51073b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.p.a aVar = (h.p.a) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(aVar, "value");
        fVar.encodeString(aVar.a());
    }
}
