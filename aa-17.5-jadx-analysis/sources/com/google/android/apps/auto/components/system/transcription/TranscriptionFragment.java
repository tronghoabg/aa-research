package com.google.android.apps.auto.components.system.transcription;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.acmd;
import defpackage.dvd;
import defpackage.jue;
import defpackage.khy;
import defpackage.ksa;
import defpackage.leh;
import defpackage.lgi;
import defpackage.nsr;
import defpackage.olm;
import defpackage.tmb;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public final class TranscriptionFragment extends Fragment {
    private static final yph d = yph.c("GH.TranscriptionFrag");
    public TranscriptionTextView a;
    public ImageView b;
    PendingTranscriptionState c;
    private View e;
    private ImageView f;
    private ImageView g;
    private CardView h;

    public static final boolean c() {
        return nsr.c().b().F();
    }

    public final void a(String str, int i, Bitmap bitmap, String str2) {
        ImageView imageView;
        b(new PendingTranscriptionState("", str, true, i, str2));
        if (this.f == null && this.g == null) {
            return;
        }
        if (bitmap.getWidth() > 128) {
            while (bitmap.getWidth() != 128) {
                int iMax = Math.max(bitmap.getWidth() / 2, 128);
                bitmap = Bitmap.createScaledBitmap(bitmap, iMax, iMax, true);
            }
        }
        GhIcon ghIconL = GhIcon.l(bitmap);
        boolean zB = olm.b(requireContext());
        CardView cardView = this.h;
        if (zB) {
            cardView.setVisibility(8);
            imageView = this.f;
        } else {
            cardView.setVisibility(0);
            imageView = this.g;
        }
        imageView.setVisibility(0);
        imageView.getClass();
        lgi.d(imageView, ghIconL, true, false, false);
    }

    public final void b(PendingTranscriptionState pendingTranscriptionState) {
        int length;
        int length2;
        int i;
        this.c = pendingTranscriptionState;
        TranscriptionTextView transcriptionTextView = this.a;
        if (transcriptionTextView == null) {
            ((ype) ((ype) d.e()).ai((char) 5570)).u("Attempt to update TranscriptionFragment before UI is on screen.");
            return;
        }
        int i2 = pendingTranscriptionState.d;
        if (i2 != 0) {
            if (i2 == 1) {
                transcriptionTextView.a(woy.al(pendingTranscriptionState.b));
                ImageView imageView = this.b;
                imageView.getClass();
                imageView.setVisibility(0);
                ImageView imageView2 = this.f;
                imageView2.getClass();
                imageView2.setVisibility(8);
                TranscriptionTextView transcriptionTextView2 = this.a;
                transcriptionTextView2.getClass();
                Typeface typeface = transcriptionTextView2.getTypeface();
                typeface.getClass();
                transcriptionTextView2.setTypeface(Typeface.create(typeface, 0));
                return;
            }
            if (i2 != 2) {
                return;
            }
            ImageView imageView3 = this.b;
            imageView3.getClass();
            imageView3.setVisibility(8);
            String str = pendingTranscriptionState.e;
            if (str == null || str.isEmpty()) {
                TranscriptionTextView transcriptionTextView3 = this.a;
                transcriptionTextView3.getClass();
                transcriptionTextView3.a(woy.al(pendingTranscriptionState.b));
                ImageView imageView4 = this.f;
                imageView4.getClass();
                imageView4.setVisibility(8);
                TranscriptionTextView transcriptionTextView4 = this.a;
                transcriptionTextView4.getClass();
                Typeface typeface2 = transcriptionTextView4.getTypeface();
                typeface2.getClass();
                transcriptionTextView4.setTypeface(Typeface.create(typeface2, 2));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) woy.al(pendingTranscriptionState.b));
            spannableStringBuilder.append((CharSequence) " ");
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dvd.e(this.a.getCurrentTextColor(), this.a.getContext().getResources().getInteger(R.integer.robin_car_status_transcription_text_alpha))), length3, spannableStringBuilder.length(), 33);
            } catch (Resources.NotFoundException e) {
                ((ype) ((ype) ((ype) d.h()).p(e)).ai((char) 5568)).u("R.integer.robin_car_status_transcription_text_alpha not found.");
            }
            TranscriptionTextView transcriptionTextView5 = this.a;
            transcriptionTextView5.getClass();
            transcriptionTextView5.a(spannableStringBuilder);
            TranscriptionTextView transcriptionTextView6 = this.a;
            transcriptionTextView6.getClass();
            Typeface typeface3 = transcriptionTextView6.getTypeface();
            typeface3.getClass();
            transcriptionTextView6.setTypeface(Typeface.create(typeface3, 0));
            return;
        }
        if (pendingTranscriptionState.c) {
            String str2 = pendingTranscriptionState.b;
            transcriptionTextView.a(woy.al(str2));
            length = woy.al(str2).length();
        } else {
            String str3 = pendingTranscriptionState.b;
            String str4 = pendingTranscriptionState.a;
            ype ypeVar = (ype) ((ype) TranscriptionTextView.a.e()).ai(5572);
            String strAl = woy.al(str3);
            String strAl2 = woy.al(str4);
            ypeVar.M("#updateRecognizedText [stableText: '%s', pendingText: '%s']", strAl, strAl2);
            tmb tmbVar = transcriptionTextView.d;
            long epochMilli = tmbVar.f().toEpochMilli() - transcriptionTextView.e;
            length = woy.al(str4).length() + woy.al(str3).length();
            if (epochMilli >= 80) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(strAl)) {
                    spannableStringBuilder2.append((CharSequence) strAl);
                }
                if (!strAl2.isEmpty()) {
                    int length4 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) strAl2);
                    String str5 = transcriptionTextView.f;
                    if (strAl2.isEmpty() || str5.isEmpty()) {
                        length2 = 0;
                    } else if (strAl2.startsWith(str5)) {
                        length2 = str5.length();
                    } else if (str5.startsWith(strAl2) || str5.endsWith(strAl2)) {
                        length2 = strAl2.length();
                    } else {
                        int iMax = 0;
                        for (int i3 = 0; i3 < str5.length(); i3++) {
                            int i4 = 0;
                            while (i4 < strAl2.length() && (i = i3 + i4) < str5.length() && str5.charAt(i) == strAl2.charAt(i4)) {
                                i4++;
                            }
                            iMax = Math.max(iMax, i4);
                        }
                        length2 = iMax;
                    }
                    if (length2 < strAl2.length()) {
                        spannableStringBuilder2.setSpan(transcriptionTextView.b, length2 + length4, length4 + strAl2.length(), 33);
                        ObjectAnimator objectAnimator = transcriptionTextView.c;
                        if (objectAnimator.isStarted()) {
                            objectAnimator.cancel();
                        }
                        objectAnimator.start();
                    }
                    transcriptionTextView.f = strAl2;
                }
                transcriptionTextView.setText(spannableStringBuilder2);
                transcriptionTextView.e = tmbVar.f().toEpochMilli();
            }
        }
        ImageView imageView5 = this.b;
        imageView5.getClass();
        imageView5.setVisibility(8);
        ImageView imageView6 = this.f;
        imageView6.getClass();
        imageView6.setVisibility(8);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.transcription_gradation_width);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.transcription_bubble_padding_start_end);
        int width = this.e.getWidth();
        int width2 = this.a.getWidth();
        if (width > 0) {
            int i5 = dimensionPixelSize2 + dimensionPixelSize2;
            if ((acmd.o() > 0 && length > acmd.o()) || width - i5 <= width2) {
                this.a.getPaint().setShader(new LinearGradient((width2 - dimensionPixelSize) - i5, BitmapDescriptorFactory.HUE_RED, width2 - i5, BitmapDescriptorFactory.HUE_RED, new int[]{this.a.getCurrentTextColor(), 0}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, Shader.TileMode.CLAMP));
            }
        }
        TranscriptionTextView transcriptionTextView7 = this.a;
        transcriptionTextView7.getClass();
        Typeface typeface4 = transcriptionTextView7.getTypeface();
        typeface4.getClass();
        transcriptionTextView7.setTypeface(Typeface.create(typeface4, 0));
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = layoutInflater.inflate(R.layout.transcription, viewGroup, false);
        if (bundle != null && bundle.containsKey("PENDING_TRANSCRIPTION_STATE_KEY")) {
            this.c = (PendingTranscriptionState) bundle.getParcelable("PENDING_TRANSCRIPTION_STATE_KEY");
        }
        return this.e;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        PendingTranscriptionState pendingTranscriptionState = this.c;
        if (pendingTranscriptionState != null) {
            bundle.putParcelable("PENDING_TRANSCRIPTION_STATE_KEY", pendingTranscriptionState);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((ype) ((ype) d.e()).ai((char) 5567)).u("TranscriptionFragment onViewCreated");
        boolean zJ = nsr.c().b().J();
        this.a = (TranscriptionTextView) view.findViewById(R.id.transcription_text_view);
        if (acmd.o() > 0) {
            this.a.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) acmd.o())});
        }
        this.b = (ImageView) view.findViewById(R.id.greeting_logo);
        this.f = (ImageView) view.findViewById(R.id.status_logo);
        this.g = (ImageView) view.findViewById(R.id.status_logo_with_shadow);
        this.h = (CardView) view.findViewById(R.id.status_logo_with_shadow_card_view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.transcription_container);
        if (zJ) {
            linearLayout.setGravity(8388629);
        } else {
            linearLayout.setGravity(8388627);
        }
        leh.a();
        ksa.d().e.fE(this, new jue(this, view, 13));
        PendingTranscriptionState pendingTranscriptionState = this.c;
        if (pendingTranscriptionState != null) {
            b(pendingTranscriptionState);
        }
    }

    public static class PendingTranscriptionState implements Parcelable {
        public static final Parcelable.Creator<PendingTranscriptionState> CREATOR = new khy(8);
        final String a;
        final String b;
        final boolean c;
        final int d;
        final String e;

        public PendingTranscriptionState(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readInt() == 1;
            this.d = parcel.readInt();
            this.e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(woy.al(this.a));
            parcel.writeString(woy.al(this.b));
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
        }

        public PendingTranscriptionState(String str, String str2, boolean z, int i, String str3) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
        }
    }
}
