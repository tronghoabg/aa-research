package com.waze.uid.flow_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.R;
import com.waze.sharedui.views.ap;
import com.waze.uid.h;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AuthLayoutHeader extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f44518a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f44519b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f44520c;

    public AuthLayoutHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
        d(attributeSet);
    }

    private final void c() {
        LayoutInflater.from(getContext()).inflate(R.layout.auth_layout_header, this);
        View viewFindViewById = findViewById(R.id.title);
        x.e(viewFindViewById, "findViewById(...)");
        this.f44518a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.subtitle);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f44519b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.image);
        x.e(viewFindViewById3, "findViewById(...)");
        this.f44520c = (ImageView) viewFindViewById3;
    }

    private final void d(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f44526a);
        x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        TextView textView = null;
        if (resourceId != -1) {
            TextView textView2 = this.f44518a;
            if (textView2 == null) {
                x.j("mTitle");
                textView2 = null;
            }
            ap.b(textView2, resourceId);
        } else {
            b(typedArrayObtainStyledAttributes.getString(4));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        if (resourceId2 != -1) {
            TextView textView3 = this.f44519b;
            if (textView3 == null) {
                x.j("mSubtitle");
                textView3 = null;
            }
            ap.b(textView3, resourceId2);
        } else {
            a(typedArrayObtainStyledAttributes.getString(2));
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (resourceId3 != -1) {
            ImageView imageView = this.f44520c;
            if (imageView == null) {
                x.j("mImage");
                imageView = null;
            }
            imageView.setVisibility(resourceId3 < 0 ? 8 : 0);
            ImageView imageView2 = this.f44520c;
            if (imageView2 == null) {
                x.j("mImage");
                imageView2 = null;
            }
            imageView2.setImageResource(resourceId3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            TextView textView4 = this.f44518a;
            if (textView4 == null) {
                x.j("mTitle");
                textView4 = null;
            }
            textView4.setMaxLines(i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(5, -1.0f);
            if (dimension != -1.0f) {
                TextView textView5 = this.f44518a;
                if (textView5 == null) {
                    x.j("mTitle");
                    textView5 = null;
                }
                textView5.setTextSize(0, dimension);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(3, -1.0f);
            if (dimension2 != -1.0f) {
                TextView textView6 = this.f44519b;
                if (textView6 == null) {
                    x.j("mSubtitle");
                } else {
                    textView = textView6;
                }
                textView.setTextSize(0, dimension2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(String str) {
        TextView textView = this.f44519b;
        TextView textView2 = null;
        if (textView == null) {
            x.j("mSubtitle");
            textView = null;
        }
        String str2 = str;
        textView.setVisibility(true != TextUtils.isEmpty(str2) ? 0 : 8);
        TextView textView3 = this.f44519b;
        if (textView3 == null) {
            x.j("mSubtitle");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str2);
    }

    public final void b(String str) {
        TextView textView = this.f44518a;
        TextView textView2 = null;
        if (textView == null) {
            x.j("mTitle");
            textView = null;
        }
        String str2 = str;
        textView.setVisibility(true != TextUtils.isEmpty(str2) ? 0 : 8);
        TextView textView3 = this.f44518a;
        if (textView3 == null) {
            x.j("mTitle");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str2);
    }

    public AuthLayoutHeader(Context context) {
        super(context);
        c();
    }

    public AuthLayoutHeader(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
        d(attributeSet);
    }
}
