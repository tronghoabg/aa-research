package com.fasterxml.jackson.databind.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NamingStrategyImpls {
    private static final /* synthetic */ NamingStrategyImpls[] $VALUES = $values();
    public static final NamingStrategyImpls KEBAB_CASE;
    public static final NamingStrategyImpls LOWER_CAMEL_CASE;
    public static final NamingStrategyImpls LOWER_CASE;
    public static final NamingStrategyImpls LOWER_DOT_CASE;
    public static final NamingStrategyImpls SNAKE_CASE;
    public static final NamingStrategyImpls UPPER_CAMEL_CASE;
    public static final NamingStrategyImpls UPPER_SNAKE_CASE;

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$1, reason: invalid class name */
    enum AnonymousClass1 extends NamingStrategyImpls {
        private AnonymousClass1(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return str;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$2, reason: invalid class name */
    enum AnonymousClass2 extends NamingStrategyImpls {
        private AnonymousClass2(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$3, reason: invalid class name */
    enum AnonymousClass3 extends NamingStrategyImpls {
        private AnonymousClass3(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + length);
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (i3 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z && i2 > 0 && sb.charAt(i2 - 1) != '_') {
                            sb.append('_');
                            i2++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(cCharAt);
                    i2++;
                }
            }
            return i2 > 0 ? sb.toString() : str;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$4, reason: invalid class name */
    enum AnonymousClass4 extends NamingStrategyImpls {
        private AnonymousClass4(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            String strTranslate = SNAKE_CASE.translate(str);
            if (strTranslate == null) {
                return null;
            }
            return strTranslate.toUpperCase();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$5, reason: invalid class name */
    enum AnonymousClass5 extends NamingStrategyImpls {
        private AnonymousClass5(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return (str == null || str.isEmpty()) ? str : str.toLowerCase();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$6, reason: invalid class name */
    enum AnonymousClass6 extends NamingStrategyImpls {
        private AnonymousClass6(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, '-');
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.NamingStrategyImpls$7, reason: invalid class name */
    enum AnonymousClass7 extends NamingStrategyImpls {
        private AnonymousClass7(String str, int i2) {
            super(str, i2);
        }

        @Override // com.fasterxml.jackson.databind.util.NamingStrategyImpls
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, '.');
        }
    }

    private static /* synthetic */ NamingStrategyImpls[] $values() {
        return new NamingStrategyImpls[]{LOWER_CAMEL_CASE, UPPER_CAMEL_CASE, SNAKE_CASE, UPPER_SNAKE_CASE, LOWER_CASE, KEBAB_CASE, LOWER_DOT_CASE};
    }

    static {
        LOWER_CAMEL_CASE = new AnonymousClass1("LOWER_CAMEL_CASE", 0);
        UPPER_CAMEL_CASE = new AnonymousClass2("UPPER_CAMEL_CASE", 1);
        SNAKE_CASE = new AnonymousClass3("SNAKE_CASE", 2);
        UPPER_SNAKE_CASE = new AnonymousClass4("UPPER_SNAKE_CASE", 3);
        LOWER_CASE = new AnonymousClass5("LOWER_CASE", 4);
        KEBAB_CASE = new AnonymousClass6("KEBAB_CASE", 5);
        LOWER_DOT_CASE = new AnonymousClass7("LOWER_DOT_CASE", 6);
    }

    static String translateLowerCaseWithSeparator(String str, char c2) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder((length >> 1) + length);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            char lowerCase = Character.toLowerCase(cCharAt);
            if (lowerCase == cCharAt) {
                if (i2 > 1) {
                    sb.insert(sb.length() - 1, c2);
                }
                i2 = 0;
            } else {
                if (i2 == 0) {
                    if (i3 > 0) {
                        sb.append(c2);
                    }
                    i2 = 0;
                }
                i2++;
            }
            sb.append(lowerCase);
        }
        return sb.toString();
    }

    public static NamingStrategyImpls valueOf(String str) {
        return (NamingStrategyImpls) Enum.valueOf(NamingStrategyImpls.class, str);
    }

    public static NamingStrategyImpls[] values() {
        return (NamingStrategyImpls[]) $VALUES.clone();
    }

    public abstract String translate(String str);

    private NamingStrategyImpls(String str, int i2) {
    }
}
