.class public final Lad/J;
.super Lad/i;
.source "SourceFile"


# instance fields
.field public final b:LG9/e;

.field public final c:Ljava/lang/String;

.field public final d:LJ4/c;

.field public final e:Lad/q;

.field public final f:Lad/l;

.field public final g:Lad/M;

.field public final h:Lbd/b;

.field public i:Lcom/google/android/ads/nativetemplates/TemplateView;

.field public final j:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;Ljava/util/Map;Lad/M;Lbd/b;)V
    .locals 0

    .line 9
    invoke-direct {p0, p2}, Lad/i;-><init>(I)V

    .line 10
    iput-object p1, p0, Lad/J;->j:Landroid/content/Context;

    .line 11
    iput-object p3, p0, Lad/J;->b:LG9/e;

    .line 12
    iput-object p4, p0, Lad/J;->c:Ljava/lang/String;

    .line 13
    iput-object p5, p0, Lad/J;->f:Lad/l;

    .line 14
    iput-object p6, p0, Lad/J;->d:LJ4/c;

    .line 15
    iput-object p8, p0, Lad/J;->g:Lad/M;

    .line 16
    iput-object p9, p0, Lad/J;->h:Lbd/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;Ljava/util/Map;Lad/M;Lbd/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lad/i;-><init>(I)V

    .line 2
    iput-object p1, p0, Lad/J;->j:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lad/J;->b:LG9/e;

    .line 4
    iput-object p4, p0, Lad/J;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lad/J;->e:Lad/q;

    .line 6
    iput-object p6, p0, Lad/J;->d:LJ4/c;

    .line 7
    iput-object p8, p0, Lad/J;->g:Lad/M;

    .line 8
    iput-object p9, p0, Lad/J;->h:Lbd/b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/J;->i:Lcom/google/android/ads/nativetemplates/TemplateView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/ads/nativetemplates/TemplateView;->c:Lcom/google/android/gms/ads/nativead/NativeAd;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/NativeAd;->destroy()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lad/J;->i:Lcom/google/android/ads/nativetemplates/TemplateView;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final b()Lio/flutter/plugin/platform/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lad/J;->i:Lcom/google/android/ads/nativetemplates/TemplateView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lad/N;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, v2}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 9
    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method
