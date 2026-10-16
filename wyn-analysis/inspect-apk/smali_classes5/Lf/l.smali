.class public final LLf/l;
.super LEf/A;
.source "SourceFile"


# static fields
.field public static final b:LLf/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LLf/l;

    .line 2
    .line 3
    invoke-direct {v0}, LEf/A;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LLf/l;->b:LLf/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final i(Ljf/h;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, LLf/e;->c:LLf/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, LLf/h;->b:LLf/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, p2, v0, v1}, LLf/c;->d(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final o(Ljf/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, LLf/e;->c:LLf/e;

    .line 2
    .line 3
    iget-object p1, p1, LLf/h;->b:LLf/c;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, p2, v0, v0}, LLf/c;->d(Ljava/lang/Runnable;ZZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method

.method public final y(I)LEf/A;
    .locals 1

    .line 1
    invoke-static {p1}, LJf/b;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, LLf/k;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, LEf/A;->y(I)LEf/A;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
