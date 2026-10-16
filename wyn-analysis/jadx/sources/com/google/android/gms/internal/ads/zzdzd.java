package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdzd {
    public static final zzgwt zza;
    public static final zzgwt zzb;
    private final String zzc;
    private final zzdzc zzd;
    private final zzdzc zze;

    static {
        zzdzc zzdzcVar = zzdzc.PUBLIC_API_CALL;
        zzdzc zzdzcVar2 = zzdzc.PUBLIC_API_CALLBACK;
        zzdzd zzdzdVar = new zzdzd("tqgt", zzdzcVar, zzdzcVar2);
        zzdzc zzdzcVar3 = zzdzc.DYNAMITE_ENTER;
        zzdzd zzdzdVar2 = new zzdzd("l.dl", zzdzcVar, zzdzcVar3);
        zzdzc zzdzcVar4 = zzdzc.READ_FROM_DISK_START;
        zzdzd zzdzdVar3 = new zzdzd("l.rccde", zzdzcVar3, zzdzcVar4);
        zzdzd zzdzdVar4 = new zzdzd("l.rfd", zzdzcVar4, zzdzc.READ_FROM_DISK_END);
        zzdzc zzdzcVar5 = zzdzc.CLIENT_SIGNALS_START;
        zzdzd zzdzdVar5 = new zzdzd("l.rcc", zzdzcVar3, zzdzcVar5);
        zzdzc zzdzcVar6 = zzdzc.CLIENT_SIGNALS_END;
        zzdzd zzdzdVar6 = new zzdzd("l.cs", zzdzcVar5, zzdzcVar6);
        zzdzc zzdzcVar7 = zzdzc.SERVICE_CONNECTED;
        zzdzd zzdzdVar7 = new zzdzd("l.cts", zzdzcVar6, zzdzcVar7);
        zzdzc zzdzcVar8 = zzdzc.GMS_SIGNALS_START;
        zzdzc zzdzcVar9 = zzdzc.GMS_SIGNALS_END;
        zzdzd zzdzdVar8 = new zzdzd("l.gs", zzdzcVar8, zzdzcVar9);
        zzdzc zzdzcVar10 = zzdzc.GET_SIGNALS_SDKCORE_START;
        zzdzd zzdzdVar9 = new zzdzd("l.jse", zzdzcVar9, zzdzcVar10);
        zzdzc zzdzcVar11 = zzdzc.GET_SIGNALS_SDKCORE_END;
        zzdzd zzdzdVar10 = new zzdzd("l.gs-sdkcore", zzdzcVar10, zzdzcVar11);
        zzdzd zzdzdVar11 = new zzdzd("l.gs-pp", zzdzcVar11, zzdzcVar2);
        zzdzc zzdzcVar12 = zzdzc.RENDERING_START;
        zzdzd zzdzdVar12 = new zzdzd("l.render", zzdzcVar12, zzdzcVar2);
        zzdzc zzdzcVar13 = zzdzc.RENDERING_WEBVIEW_CREATION_START;
        zzdzd zzdzdVar13 = new zzdzd("l.render.pre", zzdzcVar12, zzdzcVar13);
        zzdzc zzdzcVar14 = zzdzc.RENDERING_WEBVIEW_CREATION_END;
        zzdzd zzdzdVar14 = new zzdzd("l.render.wvc", zzdzcVar13, zzdzcVar14);
        zzdzc zzdzcVar15 = zzdzc.RENDERING_AD_COMPONENT_CREATION_END;
        zzdzd zzdzdVar15 = new zzdzd("l.render.acc", zzdzcVar14, zzdzcVar15);
        zzdzc zzdzcVar16 = zzdzc.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdzc zzdzcVar17 = zzdzc.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdzd zzdzdVar16 = new zzdzd("l.render.cfg-wv", zzdzcVar16, zzdzcVar17);
        zzdzc zzdzcVar18 = zzdzc.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdzc zzdzcVar19 = zzdzc.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgwt.zzo(zzdzdVar, zzdzdVar2, zzdzdVar3, zzdzdVar4, zzdzdVar5, zzdzdVar6, zzdzdVar7, zzdzdVar8, zzdzdVar9, zzdzdVar10, zzdzdVar11, zzdzdVar12, zzdzdVar13, zzdzdVar14, zzdzdVar15, zzdzdVar16, new zzdzd("l.render.wvlh", zzdzcVar18, zzdzcVar19), new zzdzd("l.render.post", zzdzcVar19, zzdzcVar2), new zzdzd("l.sodv", zzdzc.SIGNAL_ON_DISK_VALIDATION_START, zzdzc.SIGNAL_ON_DISK_VALIDATION_END), new zzdzd("l.sodck", zzdzc.SIGNAL_ON_DISK_CACHE_KEY_START, zzdzc.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdzd("l.sodrar", zzdzc.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdzc.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdzd("l.soddc", zzdzc.SIGNAL_ON_DISK_DECODE_START, zzdzc.SIGNAL_ON_DISK_DECODE_END));
        zzdzd zzdzdVar17 = new zzdzd("l.al", zzdzcVar, zzdzcVar2);
        zzdzd zzdzdVar18 = new zzdzd("l.al2", zzdzcVar3, zzdzcVar2);
        zzdzd zzdzdVar19 = new zzdzd("l.dl", zzdzcVar, zzdzcVar3);
        zzdzd zzdzdVar20 = new zzdzd("l.rcc", zzdzcVar3, zzdzcVar5);
        zzdzd zzdzdVar21 = new zzdzd("l.cs", zzdzcVar5, zzdzcVar6);
        zzdzd zzdzdVar22 = new zzdzd("l.cts", zzdzcVar6, zzdzcVar7);
        zzdzd zzdzdVar23 = new zzdzd("l.gs", zzdzcVar8, zzdzcVar9);
        zzdzc zzdzcVar20 = zzdzc.GET_AD_DICTIONARY_SDKCORE_START;
        zzdzd zzdzdVar24 = new zzdzd("l.jse", zzdzcVar9, zzdzcVar20);
        zzdzc zzdzcVar21 = zzdzc.GET_AD_DICTIONARY_SDKCORE_END;
        zzdzd zzdzdVar25 = new zzdzd("l.gad-js", zzdzcVar20, zzdzcVar21);
        zzdzc zzdzcVar22 = zzdzc.HTTP_RESPONSE_READY;
        zzdzd zzdzdVar26 = new zzdzd("l.http", zzdzcVar21, zzdzcVar22);
        zzdzc zzdzcVar23 = zzdzc.SCAR_PRELOADER_READY;
        zzdzd zzdzdVar27 = new zzdzd("l.slas.pre", zzdzcVar, zzdzcVar23);
        zzdzc zzdzcVar24 = zzdzc.SCAR_PRELOADER_PROCESSING_DONE;
        zzdzd zzdzdVar28 = new zzdzd("l.slas.prel.p", zzdzcVar23, zzdzcVar24);
        zzdzc zzdzcVar25 = zzdzc.NORMALIZATION_AD_RESPONSE_START;
        zzdzd zzdzdVar29 = new zzdzd("l.jse-nml", zzdzcVar22, zzdzcVar25);
        zzdzd zzdzdVar30 = new zzdzd("l.jse-nml", zzdzcVar24, zzdzcVar25);
        zzdzc zzdzcVar26 = zzdzc.NORMALIZATION_AD_RESPONSE_END;
        zzdzd zzdzdVar31 = new zzdzd("l.nml-js", zzdzcVar25, zzdzcVar26);
        zzdzc zzdzcVar27 = zzdzc.BINDER_CALL_START;
        zzdzd zzdzdVar32 = new zzdzd("l.nml-gmsg", zzdzcVar26, zzdzcVar27);
        zzdzc zzdzcVar28 = zzdzc.SERVER_RESPONSE_PARSE_START;
        zzdzd zzdzdVar33 = new zzdzd("l.nml-gmsg.s2s", zzdzcVar26, zzdzcVar28);
        zzdzd zzdzdVar34 = new zzdzd("l.binder", zzdzcVar27, zzdzcVar28);
        zzdzd zzdzdVar35 = new zzdzd("l.sr", zzdzcVar28, zzdzcVar12);
        zzdzd zzdzdVar36 = new zzdzd("l.render", zzdzcVar12, zzdzcVar2);
        zzdzd zzdzdVar37 = new zzdzd("l.t2", zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdzc zzdzcVar29 = zzdzc.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdzc zzdzcVar30 = zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdzd zzdzdVar38 = new zzdzd("l.render.na.js", zzdzcVar29, zzdzcVar30);
        zzdzd zzdzdVar39 = new zzdzd("l.render.na.prep", zzdzcVar30, zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdzd zzdzdVar40 = new zzdzd("l.render.na.lna", zzdzc.RENDERING_NATIVE_ASSETS_LOADING_START, zzdzc.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdzd zzdzdVar41 = new zzdzd("l.render.wvc", zzdzcVar13, zzdzcVar14);
        zzdzd zzdzdVar42 = new zzdzd("l.render.acc", zzdzcVar14, zzdzcVar15);
        zzdzd zzdzdVar43 = new zzdzd("l.render.cfg-wv", zzdzcVar16, zzdzcVar17);
        zzdzd zzdzdVar44 = new zzdzd("l.render.pre", zzdzcVar12, zzdzcVar13);
        zzdzd zzdzdVar45 = new zzdzd("l.render.post", zzdzcVar19, zzdzcVar2);
        zzdzd zzdzdVar46 = new zzdzd("l.render.na.post", zzdzcVar17, zzdzcVar2);
        zzdzd zzdzdVar47 = new zzdzd("l.render.wvlh", zzdzcVar18, zzdzcVar19);
        zzdzd zzdzdVar48 = new zzdzd("l.na.b", zzdzc.NATIVE_ASSETS_LOADING_BASIC_START, zzdzc.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdzd zzdzdVar49 = new zzdzd("l.na.im", zzdzc.NATIVE_ASSETS_LOADING_IMAGE_START, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdzd zzdzdVar50 = new zzdzd("l.na.imc", zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdzd zzdzdVar51 = new zzdzd("l.na.l", zzdzc.NATIVE_ASSETS_LOADING_LOGO_START, zzdzc.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdzd zzdzdVar52 = new zzdzd("l.na.ic", zzdzc.NATIVE_ASSETS_LOADING_ICON_START, zzdzc.NATIVE_ASSETS_LOADING_ICON_END);
        zzdzd zzdzdVar53 = new zzdzd("l.na.a", zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdzc zzdzcVar31 = zzdzc.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdzc zzdzcVar32 = zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgwt.zzo(zzdzdVar17, zzdzdVar18, zzdzdVar19, zzdzdVar20, zzdzdVar21, zzdzdVar22, zzdzdVar23, zzdzdVar24, zzdzdVar25, zzdzdVar26, zzdzdVar27, zzdzdVar28, zzdzdVar29, zzdzdVar30, zzdzdVar31, zzdzdVar32, zzdzdVar33, zzdzdVar34, zzdzdVar35, zzdzdVar36, zzdzdVar37, zzdzdVar38, zzdzdVar39, zzdzdVar40, zzdzdVar41, zzdzdVar42, zzdzdVar43, zzdzdVar44, zzdzdVar45, zzdzdVar46, zzdzdVar47, zzdzdVar48, zzdzdVar49, zzdzdVar50, zzdzdVar51, zzdzdVar52, zzdzdVar53, new zzdzd("l.na.v", zzdzcVar31, zzdzcVar32), new zzdzd("l.na.vc", zzdzc.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdzcVar32), new zzdzd("l.na.m", zzdzc.NATIVE_ASSETS_LOADING_MEDIA_START, zzdzc.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdzd("l.na.c", zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdzd("l.na.o", zzdzc.NATIVE_ASSETS_LOADING_OMID_START, zzdzc.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdzd(String str, zzdzc zzdzcVar, zzdzc zzdzcVar2) {
        this.zzc = str;
        this.zzd = zzdzcVar;
        this.zze = zzdzcVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdzc zzb() {
        return this.zzd;
    }

    public final zzdzc zzc() {
        return this.zze;
    }
}
