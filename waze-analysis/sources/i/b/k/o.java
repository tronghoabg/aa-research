package i.b.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends du<o, i> implements p {
    public static final int ALT_BACKGROUND_RGB_FIELD_NUMBER = 25;
    public static final int ALT_MESSAGE_RGB_FIELD_NUMBER = 23;
    public static final int ALT_SUB_TITLE_RGB_FIELD_NUMBER = 24;
    public static final int ALWAYS_SHOW_FIELD_NUMBER = 12;
    public static final int ANSWER_OPTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_RGB_FIELD_NUMBER = 17;
    public static final int BUTTONS_ORIENTATION_FIELD_NUMBER = 10;
    public static final int DEFAULT_ANSWER_FIELD_NUMBER = 5;
    private static final o DEFAULT_INSTANCE;
    public static final int DISMISSIBLE_FIELD_NUMBER = 14;
    public static final int DISMISS_ON_CLICK_FIELD_NUMBER = 26;
    public static final int DISPLAYTIMESECONDS_FIELD_NUMBER = 11;
    public static final int DISPLAY_CONTEXT_FIELD_NUMBER = 19;
    public static final int DONT_SHOW_AGAIN_CHECKBOX_VISIBLE_FIELD_NUMBER = 21;
    public static final int FONT_SCHEME_FIELD_NUMBER = 22;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 8;
    public static final int INCAR_ANSWER_OPTION_FIELD_NUMBER = 29;
    public static final int INCAR_MESSAGE_FIELD_NUMBER = 27;
    public static final int INCAR_SUB_TITLE_FIELD_NUMBER = 28;
    public static final int KEY_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 9;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MESSAGE_RGB_FIELD_NUMBER = 15;
    private static volatile fo<o> PARSER = null;
    public static final int PROFILE_IMAGE_URL_FIELD_NUMBER = 20;
    public static final int SUB_TITLE_FIELD_NUMBER = 7;
    public static final int SUB_TITLE_RGB_FIELD_NUMBER = 16;
    public static final int TEMPLATE_TYPE_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int WAZE_URL_FIELD_NUMBER = 18;
    private int altBackgroundRgb_;
    private int altMessageRgb_;
    private int altSubTitleRgb_;
    private boolean alwaysShow_;
    private int backgroundRgb_;
    private int bitField0_;
    private int buttonsOrientation_;
    private e defaultAnswer_;
    private boolean dismissOnClick_;
    private boolean dismissible_;
    private int displayTimeSeconds_;
    private boolean dontShowAgainCheckboxVisible_;
    private int messageRgb_;
    private int subTitleRgb_;
    private int templateType_;
    private int type_;
    private String id_ = "";
    private String message_ = "";
    private String incarMessage_ = "";
    private eo<b> answerOption_ = emptyProtobufList();
    private eo<b> incarAnswerOption_ = emptyProtobufList();
    private String key_ = "";
    private String subTitle_ = "";
    private String incarSubTitle_ = "";
    private String imageUrl_ = "";
    private eo<g> link_ = emptyProtobufList();
    private String wazeUrl_ = "";
    private eo<String> displayContext_ = emptyProtobufList();
    private String profileImageUrl_ = "";
    private int fontScheme_ = 1;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswerOption(Iterable<? extends b> iterable) {
        ensureAnswerOptionIsMutable();
        com.google.v.c.addAll(iterable, this.answerOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayContext(Iterable<String> iterable) {
        ensureDisplayContextIsMutable();
        com.google.v.c.addAll(iterable, this.displayContext_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIncarAnswerOption(Iterable<? extends b> iterable) {
        ensureIncarAnswerOptionIsMutable();
        com.google.v.c.addAll(iterable, this.incarAnswerOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLink(Iterable<? extends g> iterable) {
        ensureLinkIsMutable();
        com.google.v.c.addAll(iterable, this.link_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswerOption(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAnswerOptionIsMutable();
        this.answerOption_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayContext(String str) {
        Objects.requireNonNull(str);
        ensureDisplayContextIsMutable();
        this.displayContext_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayContextBytes(v vVar) {
        ensureDisplayContextIsMutable();
        this.displayContext_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncarAnswerOption(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureIncarAnswerOptionIsMutable();
        this.incarAnswerOption_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLink(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureLinkIsMutable();
        this.link_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltBackgroundRgb() {
        this.bitField0_ &= -8388609;
        this.altBackgroundRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltMessageRgb() {
        this.bitField0_ &= -2097153;
        this.altMessageRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltSubTitleRgb() {
        this.bitField0_ &= -4194305;
        this.altSubTitleRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlwaysShow() {
        this.bitField0_ &= -2049;
        this.alwaysShow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerOption() {
        this.answerOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundRgb() {
        this.bitField0_ &= -65537;
        this.backgroundRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonsOrientation() {
        this.bitField0_ &= -513;
        this.buttonsOrientation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultAnswer() {
        this.defaultAnswer_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissOnClick() {
        this.bitField0_ &= -16777217;
        this.dismissOnClick_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissible() {
        this.bitField0_ &= -8193;
        this.dismissible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayContext() {
        this.displayContext_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayTimeSeconds() {
        this.bitField0_ &= -1025;
        this.displayTimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDontShowAgainCheckboxVisible() {
        this.bitField0_ &= -524289;
        this.dontShowAgainCheckboxVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontScheme() {
        this.bitField0_ &= -1048577;
        this.fontScheme_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -257;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncarAnswerOption() {
        this.incarAnswerOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncarMessage() {
        this.bitField0_ &= -9;
        this.incarMessage_ = getDefaultInstance().getIncarMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncarSubTitle() {
        this.bitField0_ &= -129;
        this.incarSubTitle_ = getDefaultInstance().getIncarSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -33;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.bitField0_ &= -5;
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageRgb() {
        this.bitField0_ &= -16385;
        this.messageRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfileImageUrl() {
        this.bitField0_ &= -262145;
        this.profileImageUrl_ = getDefaultInstance().getProfileImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.bitField0_ &= -65;
        this.subTitle_ = getDefaultInstance().getSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitleRgb() {
        this.bitField0_ &= -32769;
        this.subTitleRgb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemplateType() {
        this.bitField0_ &= -4097;
        this.templateType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeUrl() {
        this.bitField0_ &= -131073;
        this.wazeUrl_ = getDefaultInstance().getWazeUrl();
    }

    private void ensureAnswerOptionIsMutable() {
        eo<b> eoVar = this.answerOption_;
        if (eoVar.c()) {
            return;
        }
        this.answerOption_ = du.mutableCopy(eoVar);
    }

    private void ensureDisplayContextIsMutable() {
        eo<String> eoVar = this.displayContext_;
        if (eoVar.c()) {
            return;
        }
        this.displayContext_ = du.mutableCopy(eoVar);
    }

    private void ensureIncarAnswerOptionIsMutable() {
        eo<b> eoVar = this.incarAnswerOption_;
        if (eoVar.c()) {
            return;
        }
        this.incarAnswerOption_ = du.mutableCopy(eoVar);
    }

    private void ensureLinkIsMutable() {
        eo<g> eoVar = this.link_;
        if (eoVar.c()) {
            return;
        }
        this.link_ = du.mutableCopy(eoVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefaultAnswer(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.defaultAnswer_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.defaultAnswer_ = eVar;
        this.bitField0_ |= 16;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswerOption(int i2) {
        ensureAnswerOptionIsMutable();
        this.answerOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIncarAnswerOption(int i2) {
        ensureIncarAnswerOptionIsMutable();
        this.incarAnswerOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLink(int i2) {
        ensureLinkIsMutable();
        this.link_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltBackgroundRgb(int i2) {
        this.bitField0_ |= 8388608;
        this.altBackgroundRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltMessageRgb(int i2) {
        this.bitField0_ |= 2097152;
        this.altMessageRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltSubTitleRgb(int i2) {
        this.bitField0_ |= 4194304;
        this.altSubTitleRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlwaysShow(boolean z) {
        this.bitField0_ |= 2048;
        this.alwaysShow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerOption(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAnswerOptionIsMutable();
        this.answerOption_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundRgb(int i2) {
        this.bitField0_ |= 65536;
        this.backgroundRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonsOrientation(l lVar) {
        this.buttonsOrientation_ = lVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultAnswer(e eVar) {
        Objects.requireNonNull(eVar);
        this.defaultAnswer_ = eVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissOnClick(boolean z) {
        this.bitField0_ |= 16777216;
        this.dismissOnClick_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissible(boolean z) {
        this.bitField0_ |= 8192;
        this.dismissible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayContext(int i2, String str) {
        Objects.requireNonNull(str);
        ensureDisplayContextIsMutable();
        this.displayContext_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTimeSeconds(int i2) {
        this.bitField0_ |= 1024;
        this.displayTimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDontShowAgainCheckboxVisible(boolean z) {
        this.bitField0_ |= 524288;
        this.dontShowAgainCheckboxVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontScheme(j jVar) {
        this.fontScheme_ = jVar.getNumber();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        this.imageUrl_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncarAnswerOption(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureIncarAnswerOptionIsMutable();
        this.incarAnswerOption_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncarMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.incarMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncarMessageBytes(v vVar) {
        this.incarMessage_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncarSubTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.incarSubTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncarSubTitleBytes(v vVar) {
        this.incarSubTitle_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(v vVar) {
        this.key_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureLinkIsMutable();
        this.link_.set(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(v vVar) {
        this.message_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageRgb(int i2) {
        this.bitField0_ |= 16384;
        this.messageRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.profileImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileImageUrlBytes(v vVar) {
        this.profileImageUrl_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.subTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleBytes(v vVar) {
        this.subTitle_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleRgb(int i2) {
        this.bitField0_ |= 32768;
        this.subTitleRgb_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplateType(m mVar) {
        this.templateType_ = mVar.getNumber();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(n nVar) {
        this.type_ = nVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.wazeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeUrlBytes(v vVar) {
        this.wazeUrl_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0004\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\b\t\u001b\n᠌\t\u000bင\n\fဇ\u000b\r᠌\f\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012ဈ\u0011\u0013\u001a\u0014ဈ\u0012\u0015ဇ\u0013\u0016᠌\u0014\u0017င\u0015\u0018င\u0016\u0019င\u0017\u001aဇ\u0018\u001bဈ\u0003\u001cဈ\u0007\u001d\u001b", new Object[]{"bitField0_", "id_", "type_", k.f48535d, "message_", "answerOption_", b.class, "defaultAnswer_", "key_", "subTitle_", "imageUrl_", "link_", g.class, "buttonsOrientation_", k.f48532a, "displayTimeSeconds_", "alwaysShow_", "templateType_", k.f48534c, "dismissible_", "messageRgb_", "subTitleRgb_", "backgroundRgb_", "wazeUrl_", "displayContext_", "profileImageUrl_", "dontShowAgainCheckboxVisible_", "fontScheme_", k.f48533b, "altMessageRgb_", "altSubTitleRgb_", "altBackgroundRgb_", "dismissOnClick_", "incarMessage_", "incarSubTitle_", "incarAnswerOption_", b.class});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAltBackgroundRgb() {
        return this.altBackgroundRgb_;
    }

    public int getAltMessageRgb() {
        return this.altMessageRgb_;
    }

    public int getAltSubTitleRgb() {
        return this.altSubTitleRgb_;
    }

    public boolean getAlwaysShow() {
        return this.alwaysShow_;
    }

    public b getAnswerOption(int i2) {
        return this.answerOption_.get(i2);
    }

    public int getAnswerOptionCount() {
        return this.answerOption_.size();
    }

    public List<b> getAnswerOptionList() {
        return this.answerOption_;
    }

    public c getAnswerOptionOrBuilder(int i2) {
        return this.answerOption_.get(i2);
    }

    public List<? extends c> getAnswerOptionOrBuilderList() {
        return this.answerOption_;
    }

    public int getBackgroundRgb() {
        return this.backgroundRgb_;
    }

    public l getButtonsOrientation() {
        l lVarA = l.a(this.buttonsOrientation_);
        return lVarA == null ? l.HORISONTAL : lVarA;
    }

    public e getDefaultAnswer() {
        e eVar = this.defaultAnswer_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public boolean getDismissOnClick() {
        return this.dismissOnClick_;
    }

    public boolean getDismissible() {
        return this.dismissible_;
    }

    public String getDisplayContext(int i2) {
        return this.displayContext_.get(i2);
    }

    public v getDisplayContextBytes(int i2) {
        return v.s(this.displayContext_.get(i2));
    }

    public int getDisplayContextCount() {
        return this.displayContext_.size();
    }

    public List<String> getDisplayContextList() {
        return this.displayContext_;
    }

    public int getDisplayTimeSeconds() {
        return this.displayTimeSeconds_;
    }

    public boolean getDontShowAgainCheckboxVisible() {
        return this.dontShowAgainCheckboxVisible_;
    }

    public j getFontScheme() {
        j jVarA = j.a(this.fontScheme_);
        return jVarA == null ? j.LARGE : jVarA;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    public b getIncarAnswerOption(int i2) {
        return this.incarAnswerOption_.get(i2);
    }

    public int getIncarAnswerOptionCount() {
        return this.incarAnswerOption_.size();
    }

    public List<b> getIncarAnswerOptionList() {
        return this.incarAnswerOption_;
    }

    public c getIncarAnswerOptionOrBuilder(int i2) {
        return this.incarAnswerOption_.get(i2);
    }

    public List<? extends c> getIncarAnswerOptionOrBuilderList() {
        return this.incarAnswerOption_;
    }

    public String getIncarMessage() {
        return this.incarMessage_;
    }

    public v getIncarMessageBytes() {
        return v.s(this.incarMessage_);
    }

    public String getIncarSubTitle() {
        return this.incarSubTitle_;
    }

    public v getIncarSubTitleBytes() {
        return v.s(this.incarSubTitle_);
    }

    public String getKey() {
        return this.key_;
    }

    public v getKeyBytes() {
        return v.s(this.key_);
    }

    public g getLink(int i2) {
        return this.link_.get(i2);
    }

    public int getLinkCount() {
        return this.link_.size();
    }

    public List<g> getLinkList() {
        return this.link_;
    }

    public h getLinkOrBuilder(int i2) {
        return this.link_.get(i2);
    }

    public List<? extends h> getLinkOrBuilderList() {
        return this.link_;
    }

    public String getMessage() {
        return this.message_;
    }

    public v getMessageBytes() {
        return v.s(this.message_);
    }

    public int getMessageRgb() {
        return this.messageRgb_;
    }

    public String getProfileImageUrl() {
        return this.profileImageUrl_;
    }

    public v getProfileImageUrlBytes() {
        return v.s(this.profileImageUrl_);
    }

    public String getSubTitle() {
        return this.subTitle_;
    }

    public v getSubTitleBytes() {
        return v.s(this.subTitle_);
    }

    public int getSubTitleRgb() {
        return this.subTitleRgb_;
    }

    public m getTemplateType() {
        m mVarA = m.a(this.templateType_);
        return mVarA == null ? m.FULL_SCREEN : mVarA;
    }

    public n getType() {
        n nVarA = n.a(this.type_);
        return nVarA == null ? n.UNKNOWN : nVarA;
    }

    public String getWazeUrl() {
        return this.wazeUrl_;
    }

    public v getWazeUrlBytes() {
        return v.s(this.wazeUrl_);
    }

    public boolean hasAltBackgroundRgb() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasAltMessageRgb() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasAltSubTitleRgb() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasAlwaysShow() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasBackgroundRgb() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasButtonsOrientation() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasDefaultAnswer() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDismissOnClick() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasDismissible() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasDisplayTimeSeconds() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDontShowAgainCheckboxVisible() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasFontScheme() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasImageUrl() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIncarMessage() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIncarSubTitle() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMessageRgb() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasProfileImageUrl() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasSubTitle() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSubTitleRgb() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasTemplateType() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWazeUrl() {
        return (this.bitField0_ & 131072) != 0;
    }

    public static i newBuilder(o oVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswerOption(b bVar) {
        Objects.requireNonNull(bVar);
        ensureAnswerOptionIsMutable();
        this.answerOption_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncarAnswerOption(b bVar) {
        Objects.requireNonNull(bVar);
        ensureIncarAnswerOptionIsMutable();
        this.incarAnswerOption_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLink(g gVar) {
        Objects.requireNonNull(gVar);
        ensureLinkIsMutable();
        this.link_.add(gVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
