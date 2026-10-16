.class public final Lio/ktor/utils/io/B;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lio/ktor/utils/io/t;

.field public b:LPf/a;

.field public c:J

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/B;->d:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/B;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/B;->e:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p0}, Lio/ktor/utils/io/N;->l(Lio/ktor/utils/io/t;JLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
