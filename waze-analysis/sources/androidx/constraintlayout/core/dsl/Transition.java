package androidx.constraintlayout.core.dsl;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Transition {
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    final int UNSET = -1;
    private final int DEFAULT_DURATION = DisplayStrings.DS_NIGHT;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = DisplayStrings.DS_NIGHT;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public String getId() {
        return this.mId;
    }

    public void setDuration(int i2) {
        this.mDuration = i2;
    }

    public void setFrom(String str) {
        this.mConstraintSetStart = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setKeyFrames(Keys keys) {
        this.mKeyFrames.add(keys);
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setStagger(float f2) {
        this.mStagger = f2;
    }

    public void setTo(String str) {
        this.mConstraintSetEnd = str;
    }

    String toJson() {
        return toString();
    }

    public String toString() {
        String strConcat = this.mId + ":{\nfrom:'" + this.mConstraintSetStart + "',\nto:'" + this.mConstraintSetEnd + "',\n";
        if (this.mDuration != 400) {
            strConcat = strConcat + "duration:" + this.mDuration + ",\n";
        }
        if (this.mStagger != 0.0f) {
            strConcat = strConcat + "stagger:" + this.mStagger + ",\n";
        }
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            strConcat = strConcat.concat(String.valueOf(onSwipe.toString()));
        }
        return strConcat.concat(String.valueOf(this.mKeyFrames.toString())).concat("},\n");
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }
}
