.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LVa/X7;

.field public b:Ljava/io/File;

.field public c:Lio/ktor/utils/io/t;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:LVa/X7;

.field public f:I


# direct methods
.method public constructor <init>(LVa/X7;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->e:LVa/X7;

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

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->f:I

    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/d;->e:LVa/X7;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, LVa/X7;->i(LVa/X7;Ljava/io/File;LGd/a;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
