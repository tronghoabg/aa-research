.class public final Lio/ktor/utils/io/h;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lio/ktor/utils/io/m;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lio/ktor/utils/io/m;

.field public e:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/h;->d:Lio/ktor/utils/io/m;

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

    iput-object p1, p0, Lio/ktor/utils/io/h;->c:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/h;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/h;->e:I

    iget-object p1, p0, Lio/ktor/utils/io/h;->d:Lio/ktor/utils/io/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lio/ktor/utils/io/m;->g(ILlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
