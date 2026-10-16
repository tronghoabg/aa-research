package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzigz {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b5 : bArr) {
            if (b5 == 34) {
                sb2.append("\\\"");
            } else if (b5 == 39) {
                sb2.append("\\'");
            } else if (b5 != 92) {
                switch (b5) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b5 < 32 || b5 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b5 >>> 6) & 3) + 48));
                            sb2.append((char) (((b5 >>> 3) & 7) + 48));
                            sb2.append((char) ((b5 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b5);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
