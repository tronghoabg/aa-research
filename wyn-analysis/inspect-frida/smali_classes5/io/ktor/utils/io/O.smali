.class public final Lio/ktor/utils/io/O;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lio/ktor/utils/io/P;

.field public c:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/P;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/O;->b:Lio/ktor/utils/io/P;

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

    iput-object p1, p0, Lio/ktor/utils/io/O;->a:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/O;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/O;->c:I

    iget-object p1, p0, Lio/ktor/utils/io/O;->b:Lio/ktor/utils/io/P;

    invoke-virtual {p1, p0}, Lio/ktor/utils/io/P;->f(Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
