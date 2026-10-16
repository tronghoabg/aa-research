.class public final Lio/ktor/utils/io/j;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lio/ktor/utils/io/m;

.field public c:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/j;->b:Lio/ktor/utils/io/m;

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

    iput-object p1, p0, Lio/ktor/utils/io/j;->a:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/j;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/j;->c:I

    iget-object p1, p0, Lio/ktor/utils/io/j;->b:Lio/ktor/utils/io/m;

    invoke-virtual {p1, p0}, Lio/ktor/utils/io/m;->f(Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
