package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    /* compiled from: WazeSource */
    public class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            if (strReverse != null) {
                return this._t2.reverse(strReverse);
            }
            return null;
        }

        public String toString() {
            NameTransformer nameTransformer = this._t2;
            return "[ChainedTransformer(" + String.valueOf(this._t1) + ", " + String.valueOf(nameTransformer) + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    /* compiled from: WazeSource */
    public final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        protected NopTransformer() {
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = (str == null || str.isEmpty()) ? false : true;
        boolean z2 = (str2 == null || str2.isEmpty()) ? false : true;
        return z ? z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (!str3.startsWith(str)) {
                    return null;
                }
                String strSubstring = str3.substring(str.length());
                if (strSubstring.endsWith(str2)) {
                    return strSubstring.substring(0, strSubstring.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                return "[PreAndSuffixTransformer('" + str + "','" + str2 + "')]";
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return str + str3 + str2;
            }
        } : new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.startsWith(str)) {
                    return str3.substring(str.length());
                }
                return null;
            }

            public String toString() {
                return "[PrefixTransformer('" + str + "')]";
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return String.valueOf(str).concat(String.valueOf(str3));
            }
        } : z2 ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.endsWith(str2)) {
                    return str3.substring(0, str3.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                return "[SuffixTransformer('" + str2 + "')]";
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return String.valueOf(str3).concat(String.valueOf(str2));
            }
        } : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
