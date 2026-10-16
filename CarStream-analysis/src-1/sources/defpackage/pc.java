package defpackage;

import java.text.Normalizer;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class pc {
    public static final String[][] e = {new String[]{"VTV1", "vtv1-1,1"}, new String[]{"VTV2", "vtv2-1,2"}, new String[]{"VTV3", "vtv3-1,3"}, new String[]{"VTV4", "vtv4-1,4"}, new String[]{"VTV5", "vtv5-1,5"}, new String[]{"VTV6", "vtv6-1,13"}, new String[]{"VTV7", "vtv7-1,27"}, new String[]{"VTV8", "vtv8-1,36"}, new String[]{"VTV9", "vtv9-1,39"}, new String[]{"VTV10", "vtv10-1,6"}, new String[]{"Vietnam Today", "vietnam-today-1,vietnamtoday"}, new String[]{"VTV5 Tây Nam Bộ", "vtv5-tay-nam-bo-1,7"}, new String[]{"VTV5 Tây Nguyên", "vtv5-tay-nguyen-1,163"}, new String[]{"ANTV", "truyen-hinh-cong-an-nhan-dan-1,89"}, new String[]{"QPVN", "truyen-hinh-quoc-phong-viet-nam-1,103"}, new String[]{"Hà Nội 1", "truyen-hinh-ha-noi-1-1,111"}, new String[]{"Hà Nội 2", "truyen-hinh-ha-noi-2-1,17"}, new String[]{"Hưng Yên", "truyen-hinh-hung-yen-1,185"}, new String[]{"Thanh Hóa", "truyen-hinh-thanh-hoa-1,181"}, new String[]{"Nghệ An", "truyen-hinh-nghe-an-1,121"}, new String[]{"Phú Thọ", "truyen-hinh-phu-tho-1,229"}, new String[]{"An Giang", "truyen-hinh-an-giang-1,231"}, new String[]{"Ninh Bình", "truyen-hinh-ninh-binh-1,183"}, new String[]{"Quảng Ninh", "truyen-hinh-quang-ninh-1,119"}, new String[]{"Đà Nẵng 1", "truyen-hinh-da-nang-1-1,175"}, new String[]{"Đồng Nai 1", "truyen-hinh-dong-nai-1-1,234"}, new String[]{"Đồng Tháp 1", "truyen-hinh-dong-thap-1-1,133"}, new String[]{"Khánh Hòa", "truyen-hinh-khanh-hoa-1,125"}, new String[]{"Lai Châu", "truyen-hinh-lai-chau-1,228"}, new String[]{"Thái Nguyên", "truyen-hinh-thai-nguyen-1,238"}, new String[]{"Cà Mau", "truyen-hinh-ca-mau-1,218"}, new String[]{"Đắk Lắk", "truyen-hinh-dak-lak-1,221"}, new String[]{"Hải Phòng", "truyen-hinh-hai-phong-1,444"}, new String[]{"Bắc Ninh", "truyen-hinh-bac-ninh-1,219"}, new String[]{"Cần Thơ 2", "truyen-hinh-can-tho-2-1,244"}, new String[]{"Sơn La", "truyen-hinh-son-la-1,254"}, new String[]{"Tuyên Quang", "truyen-hinh-tuyen-quang-1,235"}, new String[]{"Quảng Trị", "truyen-hinh-quang-tri-1,236"}, new String[]{"Lào Cai", "truyen-hinh-lao-cai-1,247"}, new String[]{"Cao Bằng", "truyen-hinh-cao-bang-1,555"}};
    public static final String[][] f = {new String[]{"tik tok", "tiktok"}, new String[]{"tich toc", "tiktok"}, new String[]{"tichtoc", "tiktok"}, new String[]{"tik toc", "tiktok"}, new String[]{"tiktoc", "tiktok"}, new String[]{"diu tup", "youtube"}, new String[]{"diu tup", "youtube"}, new String[]{"you tube", "youtube"}, new String[]{"yotube", "youtube"}, new String[]{"iu tup", "youtube"}, new String[]{"vtv go", "vtvgo"}, new String[]{"vi ti vi go", "vtvgo"}, new String[]{"ve te ve go", "vtvgo"}, new String[]{"ve te ve", "vtv"}, new String[]{"vi ti vi", "vtv"}, new String[]{"vê tê vê", "vtv"}, new String[]{"an ninh tv", "antv"}, new String[]{"an ninh", "antv"}, new String[]{"truyen hinh cong an nhan dan", "antv"}, new String[]{"mot", "1"}, new String[]{"hai", "2"}, new String[]{"ba", "3"}, new String[]{"bon", "4"}, new String[]{"nam", "5"}, new String[]{"sau", "6"}, new String[]{"bay", "7"}, new String[]{"tam", "8"}, new String[]{"chin", "9"}, new String[]{"muoi", "10"}};
    public static final String[] g = {"mo ", "bat ", "vao ", "chuyen sang ", "chuyen ", "xem ", "phat kenh ", "sang ", "dang "};
    public static final String[] h = {"tim kiem ", "tim ", "phat ", "nghe ", "cho toi nghe ", "cho toi xem "};
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public pc(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public static String a(String str) {
        if (str.equals("youtube")) {
            return "youtube";
        }
        if (str.equals("tiktok")) {
            return "tiktok";
        }
        if (str.equals("vtvgo") || str.equals("vtv")) {
            return "vtvgo";
        }
        return null;
    }

    public static String b(String str) {
        for (int i = 0; i < 40; i++) {
            String[] strArr = e[i];
            if (c(strArr[0]).equals(str)) {
                return strArr[1];
            }
        }
        return null;
    }

    public static String c(String str) {
        String[][] strArr;
        String strTrim = Normalizer.normalize(str.trim().toLowerCase(Locale.US), Normalizer.Form.NFD).replaceAll("\\p{M}", "").replace((char) 273, 'd').replaceAll("[^a-z0-9 ]", " ").replaceAll("\\s+", " ").trim();
        int i = 0;
        while (true) {
            strArr = f;
            if (i >= 29) {
                break;
            }
            String[] strArr2 = strArr[i];
            if (strArr2[0].indexOf(32) >= 0) {
                strTrim = strTrim.replace(strArr2[0], strArr2[1]);
            }
            i++;
        }
        String[] strArrSplit = strTrim.split(" ");
        StringBuilder sb = new StringBuilder();
        int length = strArrSplit.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArrSplit[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= 29) {
                    break;
                }
                String[] strArr3 = strArr[i3];
                if (strArr3[0].indexOf(32) < 0 && strArr3[0].equals(str2)) {
                    str2 = strArr3[1];
                    break;
                }
                i3++;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(str2);
        }
        return sb.toString().replaceAll("\\bvtv (\\d)", "vtv$1").trim();
    }

    public static boolean d(String str, String str2) {
        String[] strArrSplit = str.split(" ");
        String strD = ad.d(" ", str2, " ");
        for (String str3 : strArrSplit) {
            if (!str3.isEmpty()) {
                if (strD.indexOf(" " + str3 + " ") < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public pc(int i, String str, String str2, String str3, String str4) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
