.class public final Lcom/google/android/recaptcha/internal/zzz;
.super Lcom/google/android/recaptcha/internal/zzac;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/recaptcha/internal/zzrm;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/google/android/recaptcha/internal/zzrm;)V
    .locals 1
    .param p2    # Lcom/google/android/recaptcha/internal/zzrm;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/recaptcha/internal/zzac;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzz;->zza:Lcom/google/android/recaptcha/internal/zzrm;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/recaptcha/internal/zzrm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzz;->zza:Lcom/google/android/recaptcha/internal/zzrm;

    return-object v0
.end method
