package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.bn;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes7.dex */
public class WazeTextView extends bn {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f39167a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f39168b;

    public WazeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39168b = false;
        if (attributeSet != null && isInEditMode()) {
            int i3 = 0;
            while (true) {
                try {
                    if (i3 < attributeSet.getAttributeCount()) {
                        if (attributeSet.getAttributeName(i3).contains("fontTypeId")) {
                            String lowerCase = attributeSet.getAttributeValue(i3).toLowerCase(Locale.getDefault());
                            if (lowerCase.contains("boldit")) {
                                setTypeface(null, 3);
                            } else if (lowerCase.contains(TtmlNode.BOLD)) {
                                setTypeface(null, 1);
                            }
                        } else {
                            i3++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            break;
        }
        if (com.waze.sharedui.h.m()) {
            if (attributeSet != null) {
                int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0);
                if (attributeResourceValue != 0) {
                    ap.b(this, attributeResourceValue);
                }
            } else {
                attributeSet = null;
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39068f);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            ViewCompat.setBackgroundTintList(this, ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0)));
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i4 == 0) {
            f(typedArrayObtainStyledAttributes);
        } else if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int color = typedArrayObtainStyledAttributes.getColor(1, ContextCompat.getColor(getContext(), R.color.content_default));
            g(context, com.waze.sharedui.utils.o.b(i4));
            setTextColor(color);
        } else {
            g(context, com.waze.sharedui.utils.o.b(i4));
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(7, false);
            h.g.b.x.f(this, "<this>");
            setPaintFlags(z ? getPaintFlags() | 16 : getPaintFlags() & (-17));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static Typeface d(Context context, int i2) {
        int i3;
        if (i2 == 0) {
            return null;
        }
        switch (i2) {
            case 1:
                i3 = R.font.roboto_regular;
                break;
            case 2:
                i3 = R.font.roboto_black;
                break;
            case 3:
                i3 = R.font.roboto_bold;
                break;
            case 4:
                i3 = R.font.roboto_light;
                break;
            case 5:
                i3 = R.font.roboto_medium;
                break;
            case 6:
                i3 = R.font.roboto_condensed_regular;
                break;
            case 7:
                i3 = R.font.roboto_condensed_bold;
                break;
            case 8:
                i3 = R.font.roboto_condensed_light;
                break;
            case 9:
                i3 = R.font.roboto_slab_regular;
                break;
            case 10:
                i3 = R.font.roboto_slab_bold;
                break;
            case 11:
                i3 = R.font.proximanova_bold;
                break;
            case 12:
                i3 = R.font.proximanova_light;
                break;
            case 13:
                i3 = R.font.proximanova_semibold;
                break;
            case 14:
                i3 = R.font.proximanova_regular;
                break;
            case 15:
                i3 = R.font.roboto_italic;
                break;
            case 16:
                i3 = R.font.roboto_bolditalic;
                break;
            case 17:
                i3 = R.font.roboto_lightitalic;
                break;
            case 18:
                i3 = R.font.roboto_mediumitalic;
                break;
            case 19:
                i3 = R.font.proximanova_extraboldit;
                break;
            case 20:
                i3 = R.font.proximanova_lightit;
                break;
            case 21:
                i3 = R.font.proximanova_semiboldit;
                break;
            case 22:
                i3 = R.font.proximanova_regularit;
                break;
            case 23:
                i3 = R.font.proximanova_extrabold;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            return null;
        }
        HashMap map = f39167a;
        Integer numValueOf = Integer.valueOf(i3);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, context.getResources().getFont(i3));
        }
        return (Typeface) map.get(numValueOf);
    }

    public final void e(int i2) {
        setTypeface(d(getContext(), i2), 0);
    }

    protected final void f(TypedArray typedArray) {
        int[] iArr = com.waze.sharedui.n.f39063a;
        Typeface typefaceD = d(getContext(), typedArray.getInt(3, -1));
        if (typefaceD != null) {
            int i2 = typedArray.getInt(0, -1);
            if (i2 != -1) {
                setTypeface(typefaceD, i2);
            } else {
                setTypeface(typefaceD);
            }
        }
        boolean z = typedArray.getBoolean(8, false);
        this.f39168b = z;
        if (z && !(getText() instanceof Spanned)) {
            setText(getText());
        }
        int i3 = typedArray.getInt(4, 0);
        if (i3 == 1) {
            setGravity(3);
        } else if (i3 == 2) {
            setGravity(5);
        }
    }

    public final void g(Context context, int i2) {
        int i3 = i2 - 1;
        if (i3 == 21) {
            setTextAppearance(context, R.style.Body1);
            return;
        }
        if (i3 == 22) {
            setTextAppearance(context, R.style.Body2);
            return;
        }
        if (i3 == 31) {
            setTextAppearance(context, R.style.Caption);
            return;
        }
        switch (i3) {
            case 1:
                setTextAppearance(context, R.style.Headline1);
                break;
            case 2:
                setTextAppearance(context, R.style.Headline2);
                break;
            case 3:
                setTextAppearance(context, R.style.Headline3);
                break;
            case 4:
                setTextAppearance(context, R.style.Headline4);
                break;
            case 5:
                setTextAppearance(context, R.style.Headline5);
                break;
            case 6:
                setTextAppearance(context, R.style.Headline6);
                break;
            case 7:
                setTextAppearance(context, R.style.Headline7);
                break;
            default:
                switch (i3) {
                    case 11:
                        setTextAppearance(context, R.style.Subhead1);
                        break;
                    case 12:
                        setTextAppearance(context, R.style.Subhead2);
                        break;
                    case 13:
                        setTextAppearance(context, R.style.Subhead3);
                        break;
                    case 14:
                        setTextAppearance(context, R.style.Subhead4);
                        break;
                }
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f39168b) {
            charSequence = Html.fromHtml("<u>" + String.valueOf(charSequence) + "</u");
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.support.v7.widget.bn, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) throws Resources.NotFoundException {
        super.setTextAppearance(context, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, com.waze.sharedui.n.f39068f);
        f(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public WazeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WazeTextView(Context context) {
        this(context, null);
    }
}
