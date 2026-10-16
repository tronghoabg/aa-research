package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
final class zbwj {
    public static String zba(zbtc zbtcVar) {
        StringBuilder sb2 = new StringBuilder(zbtcVar.zbd());
        for (int i5 = 0; i5 < zbtcVar.zbd(); i5++) {
            byte bZba = zbtcVar.zba(i5);
            if (bZba == 34) {
                sb2.append("\\\"");
            } else if (bZba == 39) {
                sb2.append("\\'");
            } else if (bZba != 92) {
                switch (bZba) {
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
                        if (bZba < 32 || bZba > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bZba >>> 6) & 3) + 48));
                            sb2.append((char) (((bZba >>> 3) & 7) + 48));
                            sb2.append((char) ((bZba & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bZba);
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
