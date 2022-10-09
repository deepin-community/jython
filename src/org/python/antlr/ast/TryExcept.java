// Autogenerated AST node
package org.python.antlr.ast;

import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.util.ArrayList;

@ExposedType(name = "_ast.TryExcept", base = stmt.class)
public class TryExcept extends stmt {
public static final PyType TYPE = PyType.fromClass(TryExcept.class);
    private java.util.List<stmt> body;
    public java.util.List<stmt> getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return new AstList(body, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        this.body = AstAdapters.py2stmtList(body);
    }

    private java.util.List<excepthandler> handlers;
    public java.util.List<excepthandler> getInternalHandlers() {
        return handlers;
    }
    @ExposedGet(name = "handlers")
    public PyObject getHandlers() {
        return new AstList(handlers, AstAdapters.excepthandlerAdapter);
    }
    @ExposedSet(name = "handlers")
    public void setHandlers(PyObject handlers) {
        this.handlers = AstAdapters.py2excepthandlerList(handlers);
    }

    private java.util.List<stmt> orelse;
    public java.util.List<stmt> getInternalOrelse() {
        return orelse;
    }
    @ExposedGet(name = "orelse")
    public PyObject getOrelse() {
        return new AstList(orelse, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "orelse")
    public void setOrelse(PyObject orelse) {
        this.orelse = AstAdapters.py2stmtList(orelse);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("body"), new PyString("handlers"), new PyString("orelse")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public TryExcept(PyType subType) {
        super(subType);
    }
    public TryExcept() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void TryExcept___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("TryExcept", args, keywords, new String[]
            {"body", "handlers", "orelse", "lineno", "col_offset"}, 3, true);
        setBody(ap.getPyObject(0, Py.None));
        setHandlers(ap.getPyObject(1, Py.None));
        setOrelse(ap.getPyObject(2, Py.None));
        int lin = ap.getInt(3, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(4, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public TryExcept(PyObject body, PyObject handlers, PyObject orelse) {
        setBody(body);
        setHandlers(handlers);
        setOrelse(orelse);
    }

    public TryExcept(Token token, java.util.List<stmt> body, java.util.List<excepthandler>
    handlers, java.util.List<stmt> orelse) {
        super(token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.handlers = handlers;
        if (handlers == null) {
            this.handlers = new ArrayList<excepthandler>();
        }
        for(PythonTree t : this.handlers) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public TryExcept(Integer ttype, Token token, java.util.List<stmt> body,
    java.util.List<excepthandler> handlers, java.util.List<stmt> orelse) {
        super(ttype, token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.handlers = handlers;
        if (handlers == null) {
            this.handlers = new ArrayList<excepthandler>();
        }
        for(PythonTree t : this.handlers) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    public TryExcept(PythonTree tree, java.util.List<stmt> body, java.util.List<excepthandler>
    handlers, java.util.List<stmt> orelse) {
        super(tree);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.handlers = handlers;
        if (handlers == null) {
            this.handlers = new ArrayList<excepthandler>();
        }
        for(PythonTree t : this.handlers) {
            addChild(t);
        }
        this.orelse = orelse;
        if (orelse == null) {
            this.orelse = new ArrayList<stmt>();
        }
        for(PythonTree t : this.orelse) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "TryExcept";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("TryExcept(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("handlers=");
        sb.append(dumpThis(handlers));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTryExcept(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (handlers != null) {
            for (PythonTree t : handlers) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (orelse != null) {
            for (PythonTree t : orelse) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
