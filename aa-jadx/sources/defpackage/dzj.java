package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dzj {
    public static final java.lang.String a;
    public static final java.lang.String b;
    public static final defpackage.dzj c;
    public static final defpackage.dzj d;
    public static final defpackage.adnr g;
    public final boolean e;
    public final int f = 2;
    public final defpackage.adnr h;

    static {
        defpackage.adnr adnrVar = defpackage.dzl.c;
        g = adnrVar;
        a = "\u200e";
        b = "\u200f";
        c = new defpackage.dzj(false, adnrVar);
        d = new defpackage.dzj(true, adnrVar);
    }

    public dzj(boolean z, defpackage.adnr adnrVar) {
        this.e = z;
        this.h = adnrVar;
    }

    public static int a(java.lang.CharSequence charSequence) {
        byte b2;
        defpackage.dzi dziVar = new defpackage.dzi(charSequence);
        dziVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = dziVar.c;
            if (i4 < dziVar.b && i == 0) {
                java.lang.CharSequence charSequence2 = dziVar.a;
                char cCharAt = charSequence2.charAt(i4);
                dziVar.d = cCharAt;
                if (java.lang.Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = java.lang.Character.codePointAt(charSequence2, dziVar.c);
                    dziVar.c += java.lang.Character.charCount(iCodePointAt);
                    b2 = java.lang.Character.getDirectionality(iCodePointAt);
                } else {
                    dziVar.c++;
                    b2 = defpackage.dzi.b(dziVar.d);
                }
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (dziVar.c > 0) {
            switch (dziVar.a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    break;
                case 18:
                    i3++;
                    continue;
                default:
                    continue;
            }
            i3--;
        }
        return 0;
    }

    public static int b(java.lang.CharSequence charSequence) {
        defpackage.dzi dziVar = new defpackage.dzi(charSequence);
        dziVar.c = dziVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (dziVar.c > 0) {
                byte bA = dziVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }
}
