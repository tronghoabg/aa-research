.class public final Lio/ktor/utils/io/v;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lio/ktor/utils/io/J;

.field public c:J

.field public d:J

.field public synthetic e:Ljava/lang/Object;

.field public f:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/v;->e:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/v;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/v;->f:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, p1, v0, v1, p0}, Lio/ktor/utils/io/N;->e(Lio/ktor/utils/io/t;Lio/ktor/utils/io/J;JLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
