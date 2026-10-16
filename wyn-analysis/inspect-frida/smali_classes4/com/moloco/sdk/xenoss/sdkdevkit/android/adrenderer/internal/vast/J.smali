.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:Lkotlin/jvm/internal/G;

.field public c:Lkotlin/jvm/internal/G;

.field public d:Lkotlin/jvm/internal/G;

.field public e:Lkotlin/jvm/internal/G;

.field public f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/util/ArrayList;

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J;->i:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J;->j:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->v(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
