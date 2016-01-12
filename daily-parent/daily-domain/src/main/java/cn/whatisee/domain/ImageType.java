package cn.whatisee.domain;

/**
 * Created by ppc on 2015/12/22.
 */
public enum ImageType {
    Avatar(0,"Avatar");
    private int code;

    private String name;

    ImageType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static ImageType valueOfEnum(int code) {
        ImageType[] iss = values();
        for (ImageType cs : iss) {
            if (cs.getCode() == code) {
                return cs;
            }
        }
        return null;
    }
}
