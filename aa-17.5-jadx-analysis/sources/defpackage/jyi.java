package defpackage;

import java.text.Normalizer;

/* loaded from: classes2.dex */
public final class jyi {
    public static final yph a = yph.c("CarApp.H.Nav");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        StringBuilder sb = new StringBuilder(strNormalize.length());
        for (int i = 0; i < strNormalize.length(); i++) {
            char cCharAt = strNormalize.charAt(i);
            switch (cCharAt) {
                case 160:
                case 8194:
                case 8195:
                case 8201:
                case 8202:
                case 8239:
                    sb.append(" ");
                    break;
                case 610:
                    sb.append('G');
                    break;
                case 618:
                    sb.append('I');
                    break;
                case 628:
                    sb.append('N');
                    break;
                case 640:
                    sb.append('R');
                    break;
                case 655:
                    sb.append('Y');
                    break;
                case 665:
                    sb.append('B');
                    break;
                case 668:
                    sb.append('H');
                    break;
                case 671:
                    sb.append('L');
                    break;
                case 7424:
                    sb.append('A');
                    break;
                case 7428:
                    sb.append('C');
                    break;
                case 7429:
                    sb.append('D');
                    break;
                case 7431:
                    sb.append('E');
                    break;
                case 7434:
                    sb.append('J');
                    break;
                case 7435:
                    sb.append('K');
                    break;
                case 7437:
                    sb.append('M');
                    break;
                case 7439:
                    sb.append('O');
                    break;
                case 7450:
                case 65328:
                    sb.append('P');
                    break;
                case 7451:
                    sb.append('T');
                    break;
                case 7452:
                    sb.append('U');
                    break;
                case 7456:
                    sb.append('V');
                    break;
                case 7457:
                    sb.append('W');
                    break;
                case 7458:
                    sb.append('Z');
                    break;
                case 7459:
                case 65336:
                    sb.append('X');
                    break;
                case 8208:
                case 8209:
                case 8210:
                case 8211:
                case 8212:
                    sb.append("-");
                    break;
                case 8216:
                case 8217:
                    sb.append("'");
                    break;
                case 8220:
                case 8221:
                    sb.append("\"");
                    break;
                case 42800:
                    sb.append('F');
                    break;
                case 42801:
                    sb.append('S');
                    break;
                case 42927:
                    sb.append('Q');
                    break;
                default:
                    sb.append(cCharAt);
                    break;
            }
        }
        return sb.toString().replaceAll("[\\p{So}\\p{Sk}]?[\\uFE00-\\uFE0F]?", "");
    }
}
