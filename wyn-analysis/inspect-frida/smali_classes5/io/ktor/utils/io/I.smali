.class public final Lio/ktor/utils/io/I;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lio/ktor/utils/io/t;

.field public b:Lkotlin/jvm/internal/F;

.field public c:Ltf/l;

.field public d:Lio/ktor/utils/io/t;

.field public e:J

.field public synthetic f:Ljava/lang/Object;

.field public g:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/I;->f:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/I;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/I;->g:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, p1, v0, v1, p0}, Lio/ktor/utils/io/N;->f(Lio/ktor/utils/io/t;Ljava/nio/channels/FileChannel;JLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
