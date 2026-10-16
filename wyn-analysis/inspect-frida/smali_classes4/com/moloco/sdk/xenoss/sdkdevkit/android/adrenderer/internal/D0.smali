.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LY2/B;

.field public b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:LY2/B;

.field public g:I


# direct methods
.method public constructor <init>(LY2/B;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->f:LY2/B;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->f:LY2/B;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, LY2/B;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
