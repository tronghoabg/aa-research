package androidx.biometric;

import android.graphics.Bitmap;
import androidx.biometric.BiometricPrompt;
import com.waze.gas.GasNativeManager;
import h.a.c;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AuthenticationRequest {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Biometric extends AuthenticationRequest {
        public static final Companion Companion = new Companion(null);
        private final List<Fallback> authFallbacks;
        private final BodyContent content;
        private final boolean isConfirmationRequired;
        private final Bitmap logoBitmap;
        private final String logoDescription;
        private final int logoRes;
        private final Strength minStrength;
        private final String subtitle;
        private final String title;

        /* compiled from: WazeSource */
        public final class Builder {
            private final List<Fallback> authFallbacks;
            private BodyContent content;
            private boolean isConfirmationRequired;
            private Bitmap logoBitmap;
            private String logoDescription;
            private int logoRes;
            private Strength minStrength;
            private String subtitle;
            private final String title;

            public Builder(String str, Fallback... fallbackArr) {
                x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
                x.f(fallbackArr, "authFallbacks");
                this.title = str;
                this.authFallbacks = c.X(fallbackArr);
                this.minStrength = Strength.Class2.INSTANCE;
                this.isConfirmationRequired = true;
            }

            public final Biometric build() {
                return new Biometric(this.title, this.authFallbacks, this.minStrength, this.subtitle, this.content, this.isConfirmationRequired, this.logoBitmap, this.logoRes, this.logoDescription, null);
            }

            public final Builder setContent(BodyContent bodyContent) {
                this.content = bodyContent;
                return this;
            }

            public final Builder setIsConfirmationRequired(boolean z) {
                this.isConfirmationRequired = z;
                return this;
            }

            public final Builder setLogoBitmap(Bitmap bitmap) {
                this.logoBitmap = bitmap;
                return this;
            }

            public final Builder setLogoDescription(String str) {
                this.logoDescription = str;
                return this;
            }

            public final Builder setLogoRes(int i2) {
                this.logoRes = i2;
                return this;
            }

            public final Builder setMinStrength(Strength strength) {
                x.f(strength, "minStrength");
                this.minStrength = strength;
                return this;
            }

            public final Builder setSubtitle(String str) {
                this.subtitle = str;
                return this;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Biometric(String str, List<? extends Fallback> list, Strength strength, String str2, BodyContent bodyContent, boolean z, Bitmap bitmap, int i2, String str3) {
            this.title = str;
            this.authFallbacks = list;
            this.minStrength = strength;
            this.subtitle = str2;
            this.content = bodyContent;
            this.isConfirmationRequired = z;
            this.logoBitmap = bitmap;
            this.logoRes = i2;
            this.logoDescription = str3;
            List<? extends Fallback> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if ((((Fallback) it.next()) instanceof Fallback.DeviceCredential) && (i3 = i3 + 1) < 0) {
                        i.o();
                    }
                }
                if (i3 > 1) {
                    throw new IllegalArgumentException("At most one DeviceCredential can be provided as a fallback option.");
                }
            }
            int size = this.authFallbacks.size();
            Companion companion = Companion;
            companion.getMaxFallbackOptions();
            if (size <= 4) {
                return;
            }
            companion.getMaxFallbackOptions();
            throw new IllegalArgumentException("Maximum fallback option count exceeded. A maximum of 4 fallbacks are allowed.");
        }

        public static final int getMaxFallbackOptions() {
            Companion.getMaxFallbackOptions();
            return 4;
        }

        public final List<Fallback> getAuthFallbacks() {
            return this.authFallbacks;
        }

        public final BodyContent getContent() {
            return this.content;
        }

        public final Bitmap getLogoBitmap() {
            return this.logoBitmap;
        }

        public final String getLogoDescription() {
            return this.logoDescription;
        }

        public final int getLogoRes() {
            return this.logoRes;
        }

        public final Strength getMinStrength() {
            return this.minStrength;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean isConfirmationRequired() {
            return this.isConfirmationRequired;
        }

        /* compiled from: WazeSource */
        public abstract class Fallback {
            public static final Companion Companion = new Companion(null);
            public static final int ICON_TYPE_ACCOUNT = 2;
            public static final int ICON_TYPE_GENERIC = 3;
            public static final int ICON_TYPE_PASSWORD = 0;
            public static final int ICON_TYPE_QR_CODE = 1;

            /* compiled from: WazeSource */
            public final class DefaultCancel extends Fallback {
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DefaultCancel(String str) {
                    super(null);
                    x.f(str, "text");
                    this.text = str;
                }

                public final String getText() {
                    return this.text;
                }
            }

            /* compiled from: WazeSource */
            public final class DeviceCredential extends Fallback {
                public static final DeviceCredential INSTANCE = new DeviceCredential();

                private DeviceCredential() {
                    super(null);
                }
            }

            /* compiled from: WazeSource */
            public final class OverriddenDeviceCredential extends Fallback {
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OverriddenDeviceCredential(String str) {
                    super(null);
                    x.f(str, "text");
                    this.text = str;
                }

                public final String getText() {
                    return this.text;
                }
            }

            private Fallback() {
            }

            /* compiled from: WazeSource */
            public final class Companion {

                /* compiled from: WazeSource */
                @Retention(RetentionPolicy.SOURCE)
                public @interface IconType {
                }

                private Companion() {
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Fallback(o oVar) {
                this();
            }

            /* compiled from: WazeSource */
            public final class CustomOption extends Fallback {
                private final int iconType;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CustomOption(String str, int i2) {
                    super(null);
                    x.f(str, "text");
                    this.text = str;
                    this.iconType = i2;
                }

                public final int getIconType() {
                    return this.iconType;
                }

                public final String getText() {
                    return this.text;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public CustomOption(String str) {
                    this(str, 0, 2, null);
                    x.f(str, "text");
                }

                public /* synthetic */ CustomOption(String str, int i2, int i3, o oVar) {
                    this(str, (i3 & 2) != 0 ? 3 : i2);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final int getMaxFallbackOptions() {
                return 4;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* compiled from: WazeSource */
        public abstract class Strength {

            /* compiled from: WazeSource */
            public final class Class2 extends Strength {
                public static final Class2 INSTANCE = new Class2();

                private Class2() {
                    super(null);
                }
            }

            private Strength() {
            }

            public final int toAuthenticationType$biometric() {
                return this instanceof Class2 ? 255 : 15;
            }

            public /* synthetic */ Strength(o oVar) {
                this();
            }

            /* compiled from: WazeSource */
            public final class Class3 extends Strength {
                private final BiometricPrompt.CryptoObject cryptoObject;

                public /* synthetic */ Class3(BiometricPrompt.CryptoObject cryptoObject, int i2, o oVar) {
                    this(1 == (i2 & 1) ? null : cryptoObject);
                }

                public final BiometricPrompt.CryptoObject getCryptoObject() {
                    return this.cryptoObject;
                }

                public Class3(BiometricPrompt.CryptoObject cryptoObject) {
                    super(null);
                    this.cryptoObject = cryptoObject;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Class3() {
                    this(null, 1, 0 == true ? 1 : 0);
                }
            }
        }

        public /* synthetic */ Biometric(String str, List list, Strength strength, String str2, BodyContent bodyContent, boolean z, Bitmap bitmap, int i2, String str3, o oVar) {
            this(str, list, strength, str2, bodyContent, z, bitmap, i2, str3);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        /* synthetic */ Biometric(java.lang.String r11, java.util.List r12, androidx.biometric.AuthenticationRequest.Biometric.Strength r13, java.lang.String r14, androidx.biometric.AuthenticationRequest.BodyContent r15, boolean r16, android.graphics.Bitmap r17, int r18, java.lang.String r19, int r20, h.g.b.o r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 4
                if (r1 == 0) goto La
                androidx.biometric.AuthenticationRequest$Biometric$Strength$Class2 r13 = androidx.biometric.AuthenticationRequest.Biometric.Strength.Class2.INSTANCE
                androidx.biometric.AuthenticationRequest$Biometric$Strength r13 = (androidx.biometric.AuthenticationRequest.Biometric.Strength) r13
            La:
                r3 = r13
                r13 = r0 & 8
                r1 = 0
                if (r13 == 0) goto L12
                r4 = r1
                goto L13
            L12:
                r4 = r14
            L13:
                r13 = r0 & 16
                if (r13 == 0) goto L19
                r5 = r1
                goto L1a
            L19:
                r5 = r15
            L1a:
                r13 = r0 & 32
                r2 = 0
                r6 = 1
                if (r13 == 0) goto L22
                r13 = r2
                goto L23
            L22:
                r13 = r6
            L23:
                r13 = r13 ^ r6
                r6 = r13 | r16
                r13 = r0 & 64
                if (r13 == 0) goto L2c
                r7 = r1
                goto L2e
            L2c:
                r7 = r17
            L2e:
                r13 = r0 & 128(0x80, float:1.8E-43)
                if (r13 == 0) goto L34
                r8 = r2
                goto L36
            L34:
                r8 = r18
            L36:
                r13 = r0 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L3f
                r9 = r1
                r0 = r10
                r2 = r12
                r1 = r11
                goto L44
            L3f:
                r9 = r19
                r0 = r10
                r1 = r11
                r2 = r12
            L44:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.AuthenticationRequest.Biometric.<init>(java.lang.String, java.util.List, androidx.biometric.AuthenticationRequest$Biometric$Strength, java.lang.String, androidx.biometric.AuthenticationRequest$BodyContent, boolean, android.graphics.Bitmap, int, java.lang.String, int, h.g.b.o):void");
        }
    }

    /* compiled from: WazeSource */
    public abstract class BodyContent {

        /* compiled from: WazeSource */
        public final class PlainText extends BodyContent {
            private final String description;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlainText(String str) {
                super(null);
                x.f(str, "description");
                this.description = str;
            }

            public final String getDescription() {
                return this.description;
            }
        }

        private BodyContent() {
        }

        public /* synthetic */ BodyContent(o oVar) {
            this();
        }

        /* compiled from: WazeSource */
        public final class ContentViewWithMoreOptionsButton extends BodyContent {
            private final String description;

            public /* synthetic */ ContentViewWithMoreOptionsButton(String str, int i2, o oVar) {
                this(1 == (i2 & 1) ? null : str);
            }

            public final String getDescription() {
                return this.description;
            }

            public ContentViewWithMoreOptionsButton(String str) {
                super(null);
                this.description = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ContentViewWithMoreOptionsButton() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: WazeSource */
        public final class VerticalList extends BodyContent {
            private final String description;
            private final List<PromptContentItem> items;

            public /* synthetic */ VerticalList(String str, List list, int i2, o oVar) {
                this(1 == (i2 & 1) ? null : str, (i2 & 2) != 0 ? i.h() : list);
            }

            public final String getDescription() {
                return this.description;
            }

            public final List<PromptContentItem> getItems() {
                return this.items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public VerticalList(String str) {
                this(str, null, 2, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public VerticalList(String str, List<? extends PromptContentItem> list) {
                super(null);
                x.f(list, "items");
                this.description = str;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public VerticalList() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Biometric biometricRequest(String str, Biometric.Fallback[] fallbackArr, l<? super Biometric.Builder, ab> lVar) {
            x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
            x.f(fallbackArr, "authFallbacks");
            x.f(lVar, "init");
            Biometric.Builder builder = new Biometric.Builder(str, (Biometric.Fallback[]) Arrays.copyOf(fallbackArr, fallbackArr.length));
            lVar.invoke(builder);
            return builder.build();
        }

        public final Credential credentialRequest(String str, l<? super Credential.Builder, ab> lVar) {
            x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
            x.f(lVar, "init");
            Credential.Builder builder = new Credential.Builder(str);
            lVar.invoke(builder);
            return builder.build();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Credential extends AuthenticationRequest {
        private final BodyContent content;
        private final BiometricPrompt.CryptoObject cryptoObject;
        private final String subtitle;
        private final String title;

        /* compiled from: WazeSource */
        public final class Builder {
            private BodyContent content;
            private BiometricPrompt.CryptoObject cryptoObject;
            private String subtitle;
            private final String title;

            public Builder(String str) {
                x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
                this.title = str;
            }

            public final Credential build() {
                return new Credential(this.title, this.subtitle, this.content, this.cryptoObject, null);
            }

            public final Builder setContent(BodyContent bodyContent) {
                this.content = bodyContent;
                return this;
            }

            public final Builder setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
                this.cryptoObject = cryptoObject;
                return this;
            }

            public final Builder setSubtitle(String str) {
                this.subtitle = str;
                return this;
            }
        }

        private Credential(String str, String str2, BodyContent bodyContent, BiometricPrompt.CryptoObject cryptoObject) {
            this.title = str;
            this.subtitle = str2;
            this.content = bodyContent;
            this.cryptoObject = cryptoObject;
        }

        public final BodyContent getContent() {
            return this.content;
        }

        public final BiometricPrompt.CryptoObject getCryptoObject() {
            return this.cryptoObject;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ Credential(String str, String str2, BodyContent bodyContent, BiometricPrompt.CryptoObject cryptoObject, o oVar) {
            this(str, str2, bodyContent, cryptoObject);
        }
    }
}
