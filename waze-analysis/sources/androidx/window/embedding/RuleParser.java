package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.webkit.ProxyConfig;
import androidx.window.R;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.EmbeddingAnimationParams;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import e.c.d.a;
import h.g.b.x;
import h.n.o;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RuleParser {
    public static final RuleParser INSTANCE = new RuleParser();

    private RuleParser() {
    }

    private final void addRuleWithDuplicatedTagCheck(HashSet<EmbeddingRule> hashSet, EmbeddingRule embeddingRule) {
        String tag = embeddingRule.getTag();
        for (EmbeddingRule embeddingRule2 : hashSet) {
            if (tag != null && x.n(tag, embeddingRule2.getTag())) {
                throw new IllegalArgumentException("Duplicated tag: " + tag + " for " + embeddingRule + ". The tag must be unique in XML rule definition.");
            }
        }
        hashSet.add(embeddingRule);
    }

    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str, String.valueOf(str).concat(string));
        }
        int iW = o.W(string, '/', 0, 6);
        if (iW > 0) {
            str = string.substring(0, iW);
            x.e(str, "substring(...)");
            string = string.substring(iW + 1);
            x.e(string, "substring(...)");
        }
        if (x.n(string, ProxyConfig.MATCH_ALL_SCHEMES) || o.W(string, '.', 0, 6) >= 0) {
            return new ComponentName(str, string);
        }
        return new ComponentName(str, str + '.' + string);
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(1);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        x.c(packageName);
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ActivityRule_alwaysExpand, false);
        typedArrayObtainStyledAttributes.recycle();
        ActivityRule.Builder alwaysExpand = new ActivityRule.Builder(a.p()).setAlwaysExpand(z);
        if (string != null) {
            alwaysExpand.setTag(string);
        }
        return alwaysExpand.build();
    }

    private final DividerAttributes parseDividerAttributes(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.DividerAttributes, 0, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
        DividerAttributes.Companion.validateXmlDividerAttributes$window(i2, typedArrayObtainStyledAttributes.hasValue(1), typedArrayObtainStyledAttributes.hasValue(R.styleable.DividerAttributes_dragRangeMaxRatio), typedArrayObtainStyledAttributes.hasValue(5));
        return DividerAttributes.Companion.createDividerAttributes$window(i2, typedArrayObtainStyledAttributes.getInt(4, -1), typedArrayObtainStyledAttributes.getColor(2, -16777216), typedArrayObtainStyledAttributes.getFloat(1, -1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.DividerAttributes_dragRangeMaxRatio, -1.0f), typedArrayObtainStyledAttributes.getBoolean(5, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        String string3 = typedArrayObtainStyledAttributes.getString(1);
        String packageName = context.getApplicationContext().getPackageName();
        x.c(packageName);
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(14);
        float f2 = typedArrayObtainStyledAttributes.getFloat(13, 0.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(11, 600);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(9, 600);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(10, 600);
        float f3 = typedArrayObtainStyledAttributes.getFloat(8, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window());
        float f4 = typedArrayObtainStyledAttributes.getFloat(7, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window());
        int i2 = typedArrayObtainStyledAttributes.getInt(6, SplitAttributes.LayoutDirection.LOCALE.getValue$window());
        int i3 = typedArrayObtainStyledAttributes.getInt(2, SplitRule.FinishBehavior.NEVER.getValue$window());
        int i4 = typedArrayObtainStyledAttributes.getInt(3, SplitRule.FinishBehavior.ALWAYS.getValue$window());
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SplitPairRule_animationBackgroundColor, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(12, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        int i6 = typedArrayObtainStyledAttributes.getInt(5, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        int i7 = typedArrayObtainStyledAttributes.getInt(4, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        typedArrayObtainStyledAttributes.recycle();
        return new SplitPairRule.Builder((Set<SplitPairFilter>) a.p()).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3).setMaxAspectRatioInPortrait(EmbeddingAspectRatio.Companion.buildAspectRatioFromValue$window(f3)).setMaxAspectRatioInLandscape(EmbeddingAspectRatio.Companion.buildAspectRatioFromValue$window(f4)).setFinishPrimaryWithSecondary(SplitRule.FinishBehavior.Companion.getFinishBehaviorFromValue$window(i3)).setFinishSecondaryWithPrimary(SplitRule.FinishBehavior.Companion.getFinishBehaviorFromValue$window(i4)).setClearTop(z).setDefaultSplitAttributes(new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window(f2)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window(i2)).setAnimationParams(new EmbeddingAnimationParams.Builder().setAnimationBackground(EmbeddingAnimationBackground.Companion.buildFromValue$window(color)).setOpenAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i5)).setCloseAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i6)).setChangeAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i7)).build()).build()).build();
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(14);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(13, false);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, SplitRule.FinishBehavior.ALWAYS.getValue$window());
        if (i2 == SplitRule.FinishBehavior.NEVER.getValue$window()) {
            throw new IllegalArgumentException("Never is not a valid configuration for Placeholder activities. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API");
        }
        float f2 = typedArrayObtainStyledAttributes.getFloat(12, 0.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(10, 600);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(8, 600);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(9, 600);
        float f3 = typedArrayObtainStyledAttributes.getFloat(7, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window());
        float f4 = typedArrayObtainStyledAttributes.getFloat(6, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window());
        int i3 = typedArrayObtainStyledAttributes.getInt(5, SplitAttributes.LayoutDirection.LOCALE.getValue$window());
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SplitPlaceholderRule_animationBackgroundColor, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(11, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        int i5 = typedArrayObtainStyledAttributes.getInt(4, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        int i6 = typedArrayObtainStyledAttributes.getInt(3, EmbeddingAnimationParams.AnimationSpec.DEFAULT.getValue$window());
        typedArrayObtainStyledAttributes.recycle();
        SplitAttributes splitAttributesBuild = new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window(f2)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window(i3)).setAnimationParams(new EmbeddingAnimationParams.Builder().setAnimationBackground(EmbeddingAnimationBackground.Companion.buildFromValue$window(color)).setOpenAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i4)).setCloseAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i5)).setChangeAnimation(EmbeddingAnimationParams.AnimationSpec.Companion.getAnimationSpecFromValue$window(i6)).build()).build();
        String packageName = context.getApplicationContext().getPackageName();
        RuleParser ruleParser = INSTANCE;
        x.c(packageName);
        ComponentName componentNameBuildClassName = ruleParser.buildClassName(packageName, string2);
        Set setP = a.p();
        Intent component = new Intent().setComponent(componentNameBuildClassName);
        x.e(component, "setComponent(...)");
        return new SplitPlaceholderRule.Builder(setP, component).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3).setMaxAspectRatioInPortrait(EmbeddingAspectRatio.Companion.buildAspectRatioFromValue$window(f3)).setMaxAspectRatioInLandscape(EmbeddingAspectRatio.Companion.buildAspectRatioFromValue$window(f4)).setSticky(z).setFinishPrimaryWithPlaceholder(SplitRule.FinishBehavior.Companion.getFinishBehaviorFromValue$window(i2)).setDefaultSplitAttributes(splitAttributesBuild).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Set<EmbeddingRule> parseRules$window(Context context, int i2) throws Resources.NotFoundException {
        SplitPlaceholderRule splitPlaceholderRuleBuild;
        SplitPairRule splitPairRuleBuild;
        ActivityRule activityRulePlus$window;
        x.f(context, "context");
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            x.e(xml, "getXml(...)");
            HashSet<EmbeddingRule> hashSet = new HashSet<>();
            int depth = xml.getDepth();
            int next = xml.next();
            SplitPairRule splitPairRule = null;
            ActivityRule activityRule = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || x.n("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 304713008:
                                if (name.equals("DividerAttributes")) {
                                    if (splitPairRule == null) {
                                        if (splitPlaceholderRule == null) {
                                            throw new IllegalArgumentException("Found orphaned DividerAttributes");
                                        }
                                        splitPairRule = null;
                                    }
                                    DividerAttributes dividerAttributes = parseDividerAttributes(context, xml);
                                    if (splitPairRule == null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        splitPlaceholderRuleBuild = new SplitPlaceholderRule.Builder(splitPlaceholderRule).setDefaultSplitAttributes(new SplitAttributes.Builder(splitPlaceholderRule.getDefaultSplitAttributes()).setDividerAttributes(dividerAttributes).build()).build();
                                        addRuleWithDuplicatedTagCheck(hashSet, splitPlaceholderRuleBuild);
                                        splitPlaceholderRule = splitPlaceholderRuleBuild;
                                        break;
                                    } else {
                                        hashSet.remove(splitPairRule);
                                        splitPairRuleBuild = new SplitPairRule.Builder(splitPairRule).setDefaultSplitAttributes(new SplitAttributes.Builder(splitPairRule.getDefaultSplitAttributes()).setDividerAttributes(dividerAttributes).build()).build();
                                        addRuleWithDuplicatedTagCheck(hashSet, splitPairRuleBuild);
                                        splitPairRule = splitPairRuleBuild;
                                        break;
                                    }
                                }
                                break;
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule != null || splitPlaceholderRule != null) {
                                        ActivityFilter activityFilter = parseActivityFilter(context, xml);
                                        if (activityRule == null) {
                                            hashSet.remove(splitPlaceholderRule);
                                            splitPlaceholderRuleBuild = splitPlaceholderRule.plus$window(activityFilter);
                                            addRuleWithDuplicatedTagCheck(hashSet, splitPlaceholderRuleBuild);
                                            splitPlaceholderRule = splitPlaceholderRuleBuild;
                                            break;
                                        } else {
                                            hashSet.remove(activityRule);
                                            activityRulePlus$window = activityRule.plus$window(activityFilter);
                                            addRuleWithDuplicatedTagCheck(hashSet, activityRulePlus$window);
                                            activityRule = activityRulePlus$window;
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    splitPairRuleBuild = parseSplitPairRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPairRuleBuild);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule = splitPairRuleBuild;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    SplitPairFilter splitPairFilter = parseSplitPairFilter(context, xml);
                                    hashSet.remove(splitPairRule);
                                    splitPairRuleBuild = splitPairRule.plus$window(splitPairFilter);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPairRuleBuild);
                                    splitPairRule = splitPairRuleBuild;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    activityRulePlus$window = parseActivityRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, activityRulePlus$window);
                                    splitPairRule = null;
                                    splitPlaceholderRule = null;
                                    activityRule = activityRulePlus$window;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    splitPlaceholderRuleBuild = parseSplitPlaceholderRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPlaceholderRuleBuild);
                                    splitPairRule = null;
                                    activityRule = null;
                                    splitPlaceholderRule = splitPlaceholderRuleBuild;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
