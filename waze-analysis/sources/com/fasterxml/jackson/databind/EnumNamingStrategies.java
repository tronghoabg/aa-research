package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.util.NamingStrategyImpls;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class EnumNamingStrategies {
    public static final EnumNamingStrategy LOWER_CAMEL_CASE = LowerCamelCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy UPPER_CAMEL_CASE = UpperCamelCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy SNAKE_CASE = SnakeCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy UPPER_SNAKE_CASE = UpperSnakeCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy LOWER_CASE = LowerCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy KEBAB_CASE = KebabCaseStrategy.INSTANCE;
    public static final EnumNamingStrategy LOWER_DOT_CASE = LowerDotCaseStrategy.INSTANCE;

    /* compiled from: WazeSource */
    @Deprecated
    public class CamelCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final CamelCaseStrategy INSTANCE = new CamelCaseStrategy();

        protected CamelCaseStrategy() {
            super(NamingStrategyImpls.LOWER_CAMEL_CASE);
        }
    }

    /* compiled from: WazeSource */
    public abstract class DelegatingEnumNamingStrategy implements EnumNamingStrategy {
        private final NamingStrategyImpls strategy;

        protected DelegatingEnumNamingStrategy(NamingStrategyImpls namingStrategyImpls) {
            this.strategy = namingStrategyImpls;
        }

        private static int nextIndexOfUnderscore(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            while (i2 < length) {
                if (charSequence.charAt(i2) == '_') {
                    return i2;
                }
                i2++;
            }
            return -1;
        }

        private static String normalizeWord(String str) {
            if (str.length() == 0) {
                return str;
            }
            return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
        }

        protected static String toBeanName(String str) {
            StringBuilder sb = null;
            if (str == null) {
                return null;
            }
            int i2 = 0;
            int iNextIndexOfUnderscore = -1;
            do {
                iNextIndexOfUnderscore = nextIndexOfUnderscore(str, iNextIndexOfUnderscore + 1);
                if (iNextIndexOfUnderscore != -1) {
                    if (i2 == 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 4);
                        sb2.append(str.substring(0, iNextIndexOfUnderscore).toLowerCase(Locale.ROOT));
                        sb = sb2;
                    } else {
                        sb.append(normalizeWord(str.substring(i2, iNextIndexOfUnderscore)));
                    }
                    i2 = iNextIndexOfUnderscore + 1;
                }
            } while (iNextIndexOfUnderscore != -1);
            if (i2 == 0) {
                return str.toLowerCase(Locale.ROOT);
            }
            sb.append(normalizeWord(str.substring(i2)));
            return sb.toString();
        }

        @Override // com.fasterxml.jackson.databind.EnumNamingStrategy
        public String convertEnumToExternalName(String str) {
            return this.strategy.translate(toBeanName(str));
        }
    }

    /* compiled from: WazeSource */
    public class KebabCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final KebabCaseStrategy INSTANCE = new KebabCaseStrategy();

        protected KebabCaseStrategy() {
            super(NamingStrategyImpls.KEBAB_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class LowerCamelCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final LowerCamelCaseStrategy INSTANCE = new LowerCamelCaseStrategy();

        protected LowerCamelCaseStrategy() {
            super(NamingStrategyImpls.LOWER_CAMEL_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class LowerCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final LowerCaseStrategy INSTANCE = new LowerCaseStrategy();

        protected LowerCaseStrategy() {
            super(NamingStrategyImpls.LOWER_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class LowerDotCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final LowerDotCaseStrategy INSTANCE = new LowerDotCaseStrategy();

        protected LowerDotCaseStrategy() {
            super(NamingStrategyImpls.LOWER_DOT_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class SnakeCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final SnakeCaseStrategy INSTANCE = new SnakeCaseStrategy();

        protected SnakeCaseStrategy() {
            super(NamingStrategyImpls.SNAKE_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class UpperCamelCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final UpperCamelCaseStrategy INSTANCE = new UpperCamelCaseStrategy();

        protected UpperCamelCaseStrategy() {
            super(NamingStrategyImpls.UPPER_CAMEL_CASE);
        }
    }

    /* compiled from: WazeSource */
    public class UpperSnakeCaseStrategy extends DelegatingEnumNamingStrategy {
        public static final UpperSnakeCaseStrategy INSTANCE = new UpperSnakeCaseStrategy();

        protected UpperSnakeCaseStrategy() {
            super(NamingStrategyImpls.UPPER_SNAKE_CASE);
        }
    }

    private EnumNamingStrategies() {
    }
}
